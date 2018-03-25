//public buffer append(type x)
//public buffer append(char[] x[, int offset, int len])
//public buffer append(CharSequence s[, int start, int end])
//public buffer append(String s | StringBuffer s)

StringBuilder sb = StringBuilder("");
System.out.println(sb.append('?'));
System.out.println(sb.append(123));

char[] ch = {'', '', ''};
System.out.println(sb.append(ch));

CharSequence cs = new String("");
System.out.println(sb.append(cs))

