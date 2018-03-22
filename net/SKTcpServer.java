//public void bind(SocketAddress addr)
//public Socket accept()
//public void close()

System.out.println("wait....");
try(ServerSocket ss = new ServerSocket();){
  ss.bind(new InetSocketAddress("localhost", 1234));
  try(Socket cs = ss.accept();
    BufferedReader in =
	    new BufferedReader(new InputStreamReader(cs.
			    getInputStream()));
    PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
    ){
      String str;
      while(true){
        str = in.readLine();
	if(str.equals("exit")){
	  break;
	}
	out.println("(S)" + str);
	System.out.println("received:" + str);
      }
    }
} catch(Exception e){
  e.printStackTrace();
}

