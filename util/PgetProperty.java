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


