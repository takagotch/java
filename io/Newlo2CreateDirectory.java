//public static Path createDirectory(Path dir, FileAttribute<?>... attrs)
//public static Path createDirectory(Path dir, FileAttribute<?>... attrs)

Path dir = FileSystem.getDefault().getPath("C://aa/bb");
try{
  Files.createDirectories(dir);
  Files.createDirectories(dir);
} catch(IOException e){
}


