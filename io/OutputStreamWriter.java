//OutputStreamWriter(OutputStream out[, Charset cs |
//  CharsetEncoder enc | String charsetName])
//void close()
//void flush()
//void write(char[] cbuf | String str, int offset,
//  int length)
//void write(int c)


try{
  File f = new File("chap5/data/isfile2.txt");

  Charset cs = Charset.forName("SJIS");

  try(OutputStreamWriter out =
	new OutputStreamWriter(
		new FileOutputStream(f), cs.newEncoder());){
	out.write("");
  }
  File f2 = new File("chap5/data/isfile3.txt");

  try(InputStreamReader in =
	new InputStreamReader(
		new FileInputStream(f), cs.newDecoder())){
	try(OutputStreamWriter out2 =
	new OutputStreamWriter(
		new FileOutputStream(f2), "UTF-8")){
		while(in.ready())
			out2.write(in.read());
	}
  }

  try(InputStreamReader in2 =
	new InputStreamReader(new FileInputStream(f2), "UTF8")){
      while(in2.ready())
	      System.out.printf("%X", in2.read());
  }
}


