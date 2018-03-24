//public long length()
//public void setLength(long newLength)
//public int skipBytes(int n)

try{
  File f = new File("chap5/data/reSize.txt");
  f.delete();

  try(RandomAccessFile file = new RandomAccessFile(f, "rw")){
    file.write("1234567890".getBytes());
    file.seek(0);

    file.skipBytes(5);
    System.out.println(file.readLine());

    file.setLength(8);
    System.out.println("FSIZE: " + file.length());
  }
  try(FileReader in = new FileReader(f)){
    while(in.ready()) System.out.printf("%c", in.read());
  }
}catch(IOException e){
  e.printStackTrace();
}

