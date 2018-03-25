//public String getCanonicalName()
//public Package getPackage()

Class<> cls = Class.forName("java.lang.Character");

System.out.println("- getPackage -");
System.out.println(cls.getPackage().getName());

System.out.println("- getCanonicalName -");
System.out.println(cls.getCanonicalName());


//public Class[] getClass()
//public Class[] getDeclaredClass()

Class<?> cls = Class.forName("java.lang.Character");

System.out.println("- getClasses -");
for(Class<?> obj : cls.getClasses())
  System.out.println(obj.getName());

System.out.println("- getDeclaredClasses -");
for(Class<?> obj : cls.getDeclaredClass())
  System.out.println(obj.getName());


