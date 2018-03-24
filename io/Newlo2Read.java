//public static List<String> readAllLines(Path path[, Charset cs])
//public sttic byte[] readAllBytes(Path path)

List<String> lists = Arrays.asList("", "");
Path p1 = FileSystems.getDefault().getPath("C:/aa/test.txt");
try{
  Files.write(p1, lists);
  List<String> list = Files.readAllLines(p1);
  System.out.println(list);
  System.out.println(Files.readAllBytes(p1).length);
} catch(IoException e){
}

