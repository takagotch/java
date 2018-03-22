try{
  String str = "Hello";
  try (DatagramSocket ds = new DatagramSocket()){
    byte[] data = str.getBytes();
    DatagramPacket dp =
	    new DatagramPacket(data, data.length,
		InetAddress.getByName("localhost"), 8888);
    ds.send(dp);
    System.out.println("send:" + str);
  }
} catch(Exception e){
  e.printStackTrace();
}

