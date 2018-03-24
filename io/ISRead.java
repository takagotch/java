//public abstract int read()
//public int read(byte[] bf[, int off, int len])

URL sourceUrl = new URL("http://www.tky.com/");

try(InputStream in = sourceUrl.openStream()){
  int d;
  while((d = in.read()) != -1){
    System.out.printf("%c", d);
  }
}


