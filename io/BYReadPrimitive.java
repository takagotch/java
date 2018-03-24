//public final type readXxx()
//public void readFully(byte[] b[, int off, int len])
//public int readUnsignedByte()
//public int readUnsigendShort()
//public String readUTF()
//public static final String readUTF(DataInput in)

try(DataInputStream dis =
	new DataInputStream(new FileInputStream("chap5/data/byMenu.txt"));){
  int price = 0;
  byte[] item = new byte[13];

  while(true){
    try{
	    price = dis.readInt();
	    dis.readChar();
	    dis.readFully(item);
	    dis.readChar();
    } catch(IOFException e){
      break;
    }
    System.out.println(new String(item)
	+ " \\" + price + " ")
  }
} catch(IOException e){
  e.printStackTrace();
}


