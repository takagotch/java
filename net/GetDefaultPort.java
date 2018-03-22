//public int getDefaultPort()
//public String getHost()
//public String getPath()
//public int getPort()
//public String getPortocol()
//public String getQuery()

URL url = new URL("http://www.google.co.jp/search?hl=ja&soq=java");
System.out.printf("Port:%d%n", url.getDefaultPort());

System.out.printf("Host:%s%n", url.getHost());

System.out.printf("Path:%s%n", url.getPath());
System.out.printf("Port:%d%n", url.getPort());
System.out.printf("Protcol:%s%n", url.getProtocol());

System.out.printf("Query:%s%n", url.getQuery());

