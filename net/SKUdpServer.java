//public void connect(InetAddress address, int port)
//public void connect(SocketAddress addr)
//public void send(DatagramPacket p)
//public void receive(DatagramPacket p)

try{

byte buf[] = new byte[1024];
try(DatagramSocket ds =
	new DatagramSocket(8888)){
  DatagramPacket packet =
	  new DatagramPacket(buf, buf.length);
  System.out.println("wait....");
  while(true){
    ds.receive(packet);
    String str =
	    new String(packet.getData(), 0, packet.getLength());
    System.out.println("received:" + str);
  }
}

}


