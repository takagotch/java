//public void closeEntry()
//public ZipEntry getNextEntry()

try(FileInputStream fin =
	new FileInputStream("chap8/infZip.zip");
    ZipInputStream zin = new ZipInputStream(fin);){
    
    for(ZipEntry entry; (entry = zin.getNextEntry()) != null; ){
      try(FileOutputStream fout =
	new FileOutputStream(entry.getName());
	BufferedOutputStream bout =
	  new BufferedOutputStream(fout);){
	byte[] buf = new byte[128];
	for(int size;
	   (size = zin.read(buf, 0, buf.length)) != -1; ){
	   bout.write(buf, 0, size); }
	zin.closeEntry();
      }
    }
  }

