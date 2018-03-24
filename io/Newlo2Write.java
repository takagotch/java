//public static Path write(Path path, Iterable<? extends CharSequence> lines[, Charset cs], OpenOption... options)
//public static Path write(Path path, byte[] bytes, OpenOption... options)

byte[] bytes1 "".getBytes();
try{
  Path p1 = Files.createTempFile("tmp", null);
  Files.write(p1, bytes1);
  byte[] bytes2 = Files.readAllbytes(p1);
  for(byte b : bytes2)
	  System.out.printf("%X", b);
  Files.delete(p1);
} catch(IoException e){
}

