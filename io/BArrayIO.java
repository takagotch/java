//public ByteArrayInputStream(byte[] buf[, int offset, int length])

String tmp = "aaaaaaa";
try(ByteArrayInputStream in =
	new ByteArrayInputStream(tmp.getBytes())){

	for(int i = 0; i < 2; i++){
	  for(int c = 0; (c = in.read()) != -1;){
	    System.out.printf("%c",
		(i == 0) ? c : Character.toUpperCase(c));
	  }
	  System.out.println();
	  in.reset();
	}
} catch(IOException e){
  e.printStackTrace();
}


