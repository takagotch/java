//public String getProperty(String key
//  [, String defaultValue])
//public void load(Reader reader | InputStream inStream)

try(
  InputStream inputStream =
	  new FileInputStream(new File("db.properties"))){
  Properties configuration = new Properties();
  configuration.load(inputStream);
  System.out.println("host: " +
	configuration.getProperty("host", "localhost"));
} catch(IOException e){
  System.out.println("ERR;" + e.getMessage());
}


