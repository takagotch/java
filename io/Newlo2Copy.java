//public static Path copy(Path source, Path target, CopyOption... options)
//public staitc long copy(InputStream in, Path target, CopyOption... options)
//public staitc long copy(Path source, OutputStream out)
//public static Path move(Path source, Path target, CopyOption... options)

try{
  Path p1 = FileSystem.getDefault().getPath("C:aa/test.txt");
    Path p2 = FileSystems.getDefault().getPath("C:/bb/test.txt");
  Files.copy(p1, p2);

  Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);
} catch(IoExcepton e){
  e.printStackTrace();
}

try(InputStream in = new FileInputStream("C:/aa/test.txt")){
  File.copy(in, FileSystems.getDefault().getPath("C:/bb/test.txt"),
    StandardCopyOption.REPLACE_EXISTING);
} catch(IoException e){
  e.printStackTrace();
}

try(OutputStream out = new FileOutputStream("C:/bb/test.txt")){
  Files.copy(FileSystem.getDefault().getPath("C:/aa/test.txt"), out);
} catch(IoException e){
  e.printStackTrace();
}

