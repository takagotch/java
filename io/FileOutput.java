//public abstract void write(int v)
//public void write(byte[] b[, int off, int len])

try(FIleInputStream in =
	new FileInputStream("chap5/data/smile.gif");
  FileOutputStream out =
        new FileOutputStream("chap5/data/newImage.gif")){
  int data;
  while((data = in.read()) != -1){
    out.write((byte) data);
  }
}

