
String Joiner sj = new StringJoiner(",", "{", "}");

sj.add("data1").add("data2").add("data3");

System.out.println(sj.toString());

