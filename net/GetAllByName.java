//public static InetAddress getByName(String host)
//public static InetAddress[] getAllByName(String host)

try{
  System.out.println(InetAddress.getByName("www.google.co.jp"));
  for(InetAddress n :
		  InetAddress.getAllByName("www.google.com.up")){
		    System.out.println(n);
		  }
} catch(UnknownException e){
  System.out.println("Not found");
}

