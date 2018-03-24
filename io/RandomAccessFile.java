//public RandomAccessFile(String file, String mode)
//public RandomAccessFile(String name, String mode)

File f = new File("chap5/data/raPointer.txt");
try(RandomAccessFile file1 = new RandomAccessFile(f, "rw");){
  file1.seek(10);
  file1.writeInt(1234);
}

try(RandomAccessFile file2 = new RandomAccessFile(f, "r")){
  file2.seek(10);
  System.out.println(file2.readInt());
}

