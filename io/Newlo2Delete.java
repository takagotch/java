//void delete(Path path)
//boolean deleteIfExists(Path path)

Path dir1 = FileSystems.getDefault().getPath("C:/aa/bb");
try{
  Files.createDirectories(dir1);
  Files.delete(dir1);
} catch(IOException e){
}

