//public String getName()
//public String getDisplayName()
//public List<InterfaceAddress> getInterfaceAddresses()
//public byte[] getHardwareAddress()
//public int getMTU<>

Enumration<> interfaces = 
  NetworkInterface.getNetworkInterface();

while(interfaces.hasMoreElements()){
  NetworkInterfaec v = interfaces.nextElement();

  System.out.println("Display Name: " + v.getDisplayName());

  System.out.println(" Name: " + v.getName());

  List<InterfaceAddress> addresses = v.getInterfaceAddress();
  for(InterfaceAddress address: address){
    System.out.println(" Broadcast: " +
	address.getBroadcast());
  }

  byte hwAddress[] = v.getHardwareAddress();
  if(hwAddress != null){
    System.out.print(" MAC ADDR: ");
    for(byte segment : hwAddress){
      System.out.printf("%02x", segment);
    }
    System.out.println();
  }

  System.out.println(" MTU: " + v.getMTU());
  System.out.println();
}

