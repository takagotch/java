//public abstract Future<Void> connect(SocketAddress remote)
//public abstract <A> void connect(SocketAddress remote, A
//  attachment, CompletinHandler<Void, ? super A> handler)
//
//public static AsynchronousSocketChannel open()
//
//public abstract Future<Integer> read(ByteBuffer dst)
//public abstract <A> void read(ByteBuffer dst[, long
//  timeout, TimeUnit unit], A attachment,
//  CompletionHandler<Integer,? super A> handler)
//public abstract <A> void read(ByteBuffer[] dst[, int
//  offset, int length, long timeout, TimeUnit unit, A
//  attachment, CompletionHandler<Long, ? super A> handler)
//
//public abstract Future<Integer> write(ByteBuffer src)
//public abstract <A> void write(ByteBuffer src[, long
//  timeout, TimeUnit unit], A attachment,
//  CompletionHandler<Integer,? super A> handler)
//public abstract <A> void write(ByteBuffer[] srcs, int
//  offset, int length, long timeout, TimeUnit unit, A
//  attachment, CompletionHandler<Long, ? super A> handler)

try(AsynchronousSocketChannel client = AsynchronousSocketChannel, open()){
  client.connect(new InetSocketAddress("localhost", 5000)).get();

  String message = "abcdefghijk";

  ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());

  int result = client.write(buffer).get();
  System.out.println("S_BYTE" + result);
}


