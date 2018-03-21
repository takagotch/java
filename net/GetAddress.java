//public byte[] getAddress()
//
try{
  InetAddress host = InetAddress.getByName("localhost");

  for(byte b : host.getAddress()){
    System.out.print(b);
  }
}
catch(UnknownHostException e){
  System.out.println("Not found");
}


