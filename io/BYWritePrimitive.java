//public final void writeXxx(Xxx v)
//public final void writeBytes(String s)
//public final void writeChars(String s)
//public final void writeUTF(String s)

int[] prices = { 250, 280, 320 };
String[] items = { "Blend Coffee", "Caffe Latte ", "Hot Chocolate" };
try(DateOutputStream dos =
	new DataOutputStream(
	  new FileOutputStream("chap5/data/byMenu.txt"))){
  int size = prices.length;
  for(int i = 0; i < size; i++){
    dos.writeInt(prices[i]); dos.writeChar('\t');
    dos.writeBytes(); dos.writeChar('\t');
  }
}




