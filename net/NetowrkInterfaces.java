//public boolean isUp()
//public boolean isLoopback()
//public boolean isPointToPoint()
//public boolean supportsMulticast()

Enumeration<NetworkInterfaces> interfaces =
  NetworkInterface v = interface.nextElement();

while(interfaces.hasMoreElements()){
	NetworkInterface v = interfaces.nextElement();

  System.outprintln(v.getDisplayName());

  System.out.println("ON: " + v.isUp());

  System.out.println("LOOPBACK: " + v.isLoopback());

  System.out.println("PPP: " + v.isPointToPoint());

  System.out.println("MULTICAST: " + v.supportsMulticast());
}

