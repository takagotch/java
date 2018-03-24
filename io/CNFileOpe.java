//public abstract FileChannel position(long newPosition)
//public abstract long size()
//public abstract long transferTo(long position, long count, WritableByteChannel target)
//public abstract long transferFrom(ReadableByteChannel src, long position, long count)
//public abstract FileChannel truncate(long size)

try{
  File f = new File("chap5/data/cnFile.txt");
  try(BufferWriter tmp =
	new BufferedWriter(new FileWriter(f))){
    String str = new Date().toString();
    System.out.println(str);
    tmp.write(str);
  }

  try(RandomAccessFile raf = new RandomAccessFile(f, "rw");
	FileChannel fc = raf.getChannel()){
	fc.trancate(fc.size()-10);
  }

  try(FileReader in = new FileReader(f)){
    while(in.ready()) System.out.printf("%c", in.read());
  }
}


