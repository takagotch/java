//InputStreamREader(InputStream in[, Charser cs |
//  CharseDecoder dec | String charseName])
//void close()
//String getEncoding()
//int read()
//int read(char[] cbug, int offset, int length)
//boolean ready()

File f = new File("chap5/data/isfile.txt");
try{
  try(FileWriter out = new FileWriter(f);){
    out.write("aioeo");
  }

  try(InputStreamReader in =
	new InputStreamReader(
		new FileInputStream(f), Charset.defaultCharset())){
  System.out.println(in.getEncoding());
  while(in.ready())
	  System.out.prinf("%c", in.read());
  }
} catch(IOException e){
  System.out.println(e);
}

