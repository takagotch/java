//public CharArrayReader(char[] buf[, int offset, int length])

char[] chars = { '', '', '', '', '' };
try(CharArrayReader reader =
	new CharArrayReader(chars, 1, 3)){

	while(reader.ready()){
	  System.out.printf("%c", reader.read());
	}
} catch(IOException e){
  e.printStackTrace();
}

