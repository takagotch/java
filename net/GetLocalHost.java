//public static InetAddress getLocalHost()

try{
  InetAddress host = InetAddress.getLocalHost();

  for(byte b : host.getAddress()){
    System.out.println(b^0xff);
  }
} catch (UnknownHostException e){
  System.out.println("Not found");
}

