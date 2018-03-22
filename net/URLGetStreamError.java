//public InputStream getInputStream()
//public OutputStream getOutputStream()

static void view(InputStream is) throws IOException {
  try(BufferdReader in =
	new BufferedReader(new InputStreamReader(is))){
	  while(in.ready()){
	    System.out.println(in.readLine());
	  }
	}
}

public static void main(String[] args){
  URLConnection con = null;
  try{
    URL url = new URL("http://www.google.co.jp/xx");
    con = url.openConnection();

    view(con.getInputStream());
  } catch (IOException e){
    try{
      HttpURLConnection hcon = (HttpURLConnection)con;
      int rescode = hcon.getResponseCode();
      System.out.println(rescode
		      + " " + hcon.getResonseMessage());
      view(hcon.getErrorStream());
    } catch(IOException e){
      //
    }
  } catch(Exception e){
    e.printStackTrace();
  }
}

