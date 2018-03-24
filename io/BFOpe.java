//public final int capacity()
//public final int limit()
//public final int position()
//public final Buffer limit(int newLimit)
//public final Buffer position(int newPosition)
//public final Buffer mark()

static void printbuffer(String s, Buffer b){
  System.out.println(s + "\tposition:" + b.position()
	+ "\tlimit: " + b.limit() + "\tcapacity: " + b.capacity());
}

public static void main(String[] args){
  CharBuffer cb = CharBuffer.allocate(20);
  printbuffer("CHARBUFFER :", cb);

  cb.position(6);
  cb.mark();
  printbuffer("p<6,mark: ", cb);
  cb.position(10);
  printbuffer("p<10", cb);
  cb.reset(); printbuffer("reset :", cb);
  cb.flip(); printbuffer("flip :", cb);
  cb.position(5);
  printbuffer("p<5", cb);
  cb.rewind(); printbuffer("rewind :", cb);
  cb.clear(); printbuffer("clear "", cb);
}

