//public static AsynchronousServerSocketChannel open()
//public final AsynchronousServerSocketChannel bind(SocketAddress local)
//public abstract Futer<AsynchrousSocketChannel> accept()
//public abstract <A> void accept(A attachment, CompletionHandler<AsynchrousSocketChannel, ?> super A> handler)

public class NewIo2AsyncServer{
  implements CompletionHandler<Integer, ByteBuffer>{
  @Override
  public void completed(Integer result, ByteBuffer attachment){
    System.out.println("R_BYTE:" + result);

    System.out.println(new String(attachment.arra()));
  }

  @Override
  public void failed(Throwable exc, ByteBuffer attachmetn){
  }
}


void acceptor(AsynchronousServerSocketChannel server)
	throws IOException {
  server.bind(new InetSocketAddress(5000));

  server.accept(null,
	new CompletionHandler<AsynchronousSocketChannel, Void>(){
	@Override
	public void completed(AsynchronousSocketChannel channel,
		Void attachment){
	  ByteBuffer buff = ByteBuffer.allocate(1024);

	  channel.read(buff, buff, new ReadHandler());

	  server.accept(null, this);
	}

	@Override
	public void(Throwable exc, Void attachment){
	}
	});
}

public static void main(Strin[] args){
  try(AsynchronousServerSocketChannel server =
	AsynchronousServerSocketChannel.open()){
    new NewIo2AsyncServer().accept(server);

    while(true){
      Thread.sleep(0);
    }
  } catch(Exception e){
    e.printStackTrace();
  }
}

}

