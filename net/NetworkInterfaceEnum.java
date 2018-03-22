//public static Enumeration<NetworkInterface>
//  getNetworkInterfaces()


Enumeration<> interfaces =
  NetworkInterface.getNetworkInterfaces();

while(interfaces.hasMoreElements()){
  NetworkInterface v = interfaces.nextElement();

  System.out.println(v.getdisplayName());
}

