//public final InputStream openStream()

try{
  URL url = new URL("http://www.google.co.jp");

  try(InputStreamReader in =
	new InputStreamReader(url.openStream())){
    for(int c; (c = in.read()) != -1){
      System.out.printf("%c", c);
    }
  }
}


