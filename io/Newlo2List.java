//public static Stream<Path> list(Path dir)

Path p1 = FileSystems.getDefault().getPath("C:/Windows");
try(Stream<Path> stream = Files.list(p1)){
  stream.filter(v -> v.getFileName().toString().endsWith(".sys")).
	  forEach(System.out::println);
} catch(IOException e){
  e.printStackTrace();
}

