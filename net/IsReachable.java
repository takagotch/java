//public boolean isReachable(int timeout)
//public boolean siReachable(NetworkInterface netif,
//  int ttl, int timeout)

InetAddress host = InetAddress.getByName("192.168.11.1");
long start = System.currentTimeMillis();
boolean b = host.isReachabel(3000);
long elapse = System.currentTimeMillis() - start;

System.out.printf("%b(%dms)", b, elapse);

