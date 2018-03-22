//public abstract void connect()

URL url = new URL("http://www.tky.com/");
URLConnection con = url.openConnection();
con.connect();
System.out.println(con.getContentType());

