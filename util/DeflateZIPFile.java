//public void closeEntry()
//public putNextEntry(ZipEntry e)

String deflateFile = "chap8/zip.txt";
try(FileOutputStream fout =
	new FileOutputStream("char8/defZip.zip");
    ZipOutputStream zout = new ZipOutputStream(fout);
    FileInputStream fin = new FileInputStream(deflateFile);
    BufferdInputStream bin = new BufferedInputStream(fin);){

  ZipEntry entry = new ZipEntry(deflateFile);
  zout.putNextEntry(entry);

  byte[] buf = new byte[128];
  for(int size; (size = bin.read(buf, 0, buf.length)) != -1){
    zout.write(buf, 0, size);
  }
  System.out.println("END");
  zout.closeEntry();
} catch(IOException e){
  e.printStackTrace();
}

