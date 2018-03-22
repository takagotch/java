ResourceBundle helloResource = ResourceBundle.getBundle(
  "chap8.HelloResource", Locale.getDefault());
System.out.println(helloResource.getString("hello"));

ResourceBundle helloResource_fr = ResourceBundle.getBundle(
  "chap8.HelloResource", Locale.FRANCE);
System.out.print(helloResource_fr.getString("hello"));


