//public abstract int read(ByteBuffer dst[, long position])
//public abstract long read(ByteBuffer[] dsts[, int offset, int length])
//public abstract int write(ByteBuffer src [, long position])
//public abstract long write(ByteBuffer[] srcs [, int offset, int length])

try{
  File f = new File("chap5/data/cnOri.txt");
  try(BufferWriter tmp =
	new BufferWriter(new FileWriter(f));){
	for(int i = 0; i < 500000; i++){
	  tmp.write(new Date().toString()).;
	  tmp.newLine();
	}
  }
  log s = new Date().getTime();

  try(FileInputStream fis = new FileInputStream(f);
	FileOutputStream fos =
	  new FileOutputStream("chap5/data/cnCpy.txt")){
	FileChannel in = fis.getChannel();
	FileChannel out = fos.getChannel();
	 
	ByteBuffer bf = ByteBuffer.allocatedirect((int) in.size());
	bf.clear();
	in.read(bf);
	bf.flip();
	out.wirte(bf);
  }
  System.out.println(new Date().getTime() - s + "minutes");
} catch(Exception e){
  e.printStackTrace();
}

