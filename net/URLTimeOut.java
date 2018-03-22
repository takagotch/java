//public void setConectTimeout(int timeout)
//public int getConnectTime()
//public void setReadTimeout(int timeout)
//public int getReadTimeout()

try{
  URL url = new URL("http://192.168.11.1");
  URLConnection con = url.openConnection();
  con.setConnectTimeout(1000);
  con.setReadTimeout(1000*10);
  try{
    con.connect();
    System.out.printf("content:%s",
	con.getContent().toString());
  }(SocketTimeoutException e){
    System.out.printf("TIMEOUT: " + e.getMessage());
    System.out.printf("ConnectTimeout: " +
	con.getConnectTimeout());
    System.out.printf("ReadTimeout: " +
	con.getReadTimeout());
  }
} catch(Exception e){
  System.out.printg("ERR: " + e.getMessage());
}


