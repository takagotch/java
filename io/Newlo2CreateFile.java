//public static Path createFile(Path path, FileAttribute<?> ... attrs )

Path path1 = FileSystems.getDefault().getPath("C:/aa/bb.txt");
try{
  Files.createFile(path1);
} catch(IOException e){
  System.out.println("ERR");
}


