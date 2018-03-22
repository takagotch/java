//public void bind(SocketAddress bindpoint)
//public void connect(SocketAddress endpoint [, int timeout])
//public InputStream getInputStream()
//public OutputStream getOutputStream()
//pulibc void close()


try{
  try(Socket cs = new Socket("localhost", 1234);
	PrintWriter out = new PrintWriter(cs.getOutputStream(), true);
	BufferedReader in = new BufferdReader(
		new InputStreamReader(cs.getInputStream()));
	BufferedReader sin =
	        new BufferedReader(new InputStreamReader(System.in));){
		
	  String input, str;
	  while(true){
	    System.out.print("Input: ");
	    input = sin.readLine();
	    out.println(input);
	    if(input.equals("exit")){
	      break;
	    }
	    str = in.readLine();
	    System.out.println("received:" + str);
	  }
	}
} catch(Exception e){
  e.printStackTrace();
}


