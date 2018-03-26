//public String(char[] value[, int offset, int count])
//public String(char[] value | int[] value, int offset, int count)
//public Stirng(byte[] value[, int offset, int count], int count)
//public String(StringBuffer string_buffer)
//public String(StringBuilder string_builder)

char ary[] = { '', '', '', '' };
String str = new String(ary);

System.out.println(str);

String str2 = new String(ary, 1, 2);
System.out.println(str2);

