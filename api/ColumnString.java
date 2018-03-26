
String str1 = "abc";
String str2 = "abc";
String str3 = new String("abc");

System.out.println(str1 == str2);

System.out.println(str2 == str3);

//public String trim()
String str1 = "";
String str2 = str1.trim();
System.out.println(str2);


String str = "";
System.out.println("[" + str + "]");

str = str.replaceAll("^[ |\\s]*", "");

str = str.replaceAll("[ |\\s]*$", "");

System.out.println("[" + str + "]");



