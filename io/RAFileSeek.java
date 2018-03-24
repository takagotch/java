//public long getFilePointer()
//public void seek(long pos)

try{
  File f = new File("chap5/data/raPointer.txt");

  try(FileWriter out = new FileWriter(f)){
    out.write("Hello");
  }
  try(RandomAccessFile file = new RandomAccessFile(f, "rw")){
    file.seek(15);
    file.write("TK".getBytes(f));
  }
  try(FileReader in = new FileReader(f)){
    while(in.ready()) System.out.printf("%c", in.read());
  }
}

