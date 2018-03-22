//public abstract boolean connect(SocketAddress remote)
//public static SocketChannel open(SocketAddress remote)
//public abstract int read(ByteBuffer dst)
//public abstract long read(ByteBuffer[] dsts
//  [, int offset, int length])
//public abstract int write(ByteBuffer src)
//public abstract long write(ByteBuffer[] srcs
//  [, int offset, int length])

try{
  try(SocketChannel sc = SocketChannel.open()){
    sc.connect(new InetSocketAddress("localhost", 1234));
    System.out.print("Input : ");

    BufferedReader br = new BufferedReader(
	new InputStreamReader(System.in));
    CharBuffer cb = CharBuffer.wrap(br.readLine());
    sc.write(Charset.forName("ISO-8859-1")
	    .newEncoder().encode(cb);

    ByteBuffer bb = ByteBuffer.allocateDirect(1024);
    sc.read(bb);
    bb.flip();
    System.out.print("Received : ");
    System.out.println(Charset.forName("ISO-8859-1")
	    .newDecoder().decode(bb).toString());
  }
} catch(Exception e){
  e.printStackTrace();
}


