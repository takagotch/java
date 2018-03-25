try{
  Class<?> myclass1 = Class.forName("java.lang.String");

  System.out.prinln(myclass1.getName());

  Class<?> myclass2 = Class.forName("java.lang.String", true,
	Classloader.getSystemClassLoader());

  System.out.println(myclass2.getName());
} catch(ClassNotFoundException e){
}

