//public boolean isInstance(Object obj)
//public boolean isInterface()
//public boolean isArray()
//public boolean isEnum()
//public boolean isAnonymousClass()
//public boolean isMemberClass()
//public boolean isLocalClass()

String obj = new String();
System.out.println("isInstance: "
	+ new String().getClass().isInstance(obj));

class Sample();
Class<?> c = new Sample().getClass();
System.out.println("isAnonymousClass: " + c.isAnonymousClass());
System.out.println("isArray: " +
	(new int[1]).getClass().isArray());
System.out.println("isEnum: " + c.isEnum());
System.out.println("isAnonymousClass: " + c.isAnonymousClass());
System.out.println("isMemberClass: " + c.isMemberClass());
System.out.println("isLocalClass: " + c.isLocalClass());


