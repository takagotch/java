//public URLConnection openConnection(()

URL url = new URL("http://www.google.com/");
URLConnection con = url.openConnection();

System.out.println(con.getURL()); //http://www.google.com


