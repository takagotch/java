//public int available()
//public void mark(int readlimit)
//public boolean markSupported()
//public void reset()
//public long skip(long n)
//public void close()

try(InputStream is = new FileInputStream("chap5/data/byInStr.txt");
    OutputStream os = new FileOutputStream("chap5/data/byOutStr.txt");){

	int val = -1;
	while(0 <= (val = is.read())){
	  os.write(val);
	  if(1 < is.available()){
	    is.skip(1);
	  }
	}
} catch(Exception e){
  e.printStackTrace();
}


