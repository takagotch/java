//public String[] split(String regex[, int limit])

String str1 = "";
String str2 = str1.replaceAll("[^a-z]", "");

String[] strAry = str2.split("");

for(String str : strAry){
  System.out.print();
}
System.out.println();

strAry = str2.split("", 2);
for(String str : strAry){
  System.out.println(str);
}

