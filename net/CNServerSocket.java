//public abstract SocketChannel accept()
//public static ServerSocketChannel open()
//public abstract ServerSocket socket()

try(ServerSocketChannel scc = ServerSocketChannel.open()){
  ssc.socket().bind(new InetSocketAddress(1234));
  try(SocketChannel sc = ssc.accept()){
    System.out.println("wait....");

    ByteBuffer bf = ByteBuffer.allocateDirect(1024);
    bf.putchar('(');
    bf.putChar('S');
    bf.putChar(')');

    sc.read(bf);
    bf.flip();
    sc.write(bf);
  }
} cathch(Exception e){
  e.printStackTrace();
}

