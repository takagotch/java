//public static Stream<String> lines(Path path[, Charset cs])

Path p1 = FileSystems.getDefault().getPath("C:/aa/test.txt");
List<String> lists = Arrays.asList("", "", "");
try{
  Files.write(p1, lists, Charset.forName("MS932"));
  try(Stream<String> stream = Files.lines(p1, Charset.forName("MS932"))){
    stream.forEach(System.out::print);
  }
} catch(IoExceptoin e){
}

