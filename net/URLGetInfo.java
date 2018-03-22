//public Object getContent()
//public Object getContent(Class[] classes)
//public int getContentLength()
//public String getContentEncoding()
//public String getContentType()
//public long getDate()
//public long getExpiration()
//public long getLastModified()
//public String getHeaderField(int n)
//public String getHeaderField(String name)
//public String getHeaderFieldKey(int n)
//public Map<String, List<String>> getHeaderFields()
//public URL getURL()

URL url = new URL("http://www.tky.com/");
URLConnection con = url.openConnection();
Map<String, String> f1 = new LinkedHashMap<String, String>();
f1.put("URL", con.getURL().toString());
f1.put("Content-Length", Integer.toString(con.getContentLength()));
f1.put("Content-Encoding", con.getContentType());
f1.put("Expiration", Long.toString(con.getExpiration()));
f1.put("Date", new Date(con.getDate()).toString());
f1.put("LastModified", new Date(con.getLastModified()).toString());
f1.put("key1_field", con.getHeaderField(con.getHeaderFieldKey(1)));
for(String k : f1.keySet()){
  System.out.printf("%s: %s%n", k, f1.get(k));
}

Map<String, List<String>> f2 = con.getHeaderFields();
for(String k : f2.keySet()){
  System.out.printf("%nkey:%s field%s",  k, f2.get(k));
}
System.out.printf("%n%ncontent:%s",
	con.getContent().toString());


