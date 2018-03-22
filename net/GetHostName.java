InetAddress host = InetAddress.getByName("localhost");
System.out.printlnt("Host name = " + host.getHostName());

System.out.println(
		"Canonical Host name = " + host.getCanonicalHostName());

host = InetAddress.getByName("220.151.20.227");
System.out.println("Host name = " + host.getHostName());
System.out.println(
		"Canonical Host name = " + host.getCanonicalHostName());

