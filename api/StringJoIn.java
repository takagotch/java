//public static String join(CharSequence delimiter, CharSequence... elements)
//public static String join(CharSequence delimiter, Iterable<? extends CharSequence> element)

String str1 = String.join(",", "", "", "");
System.out.println(str1);

List<String> list = Arrays.asList("", "", "");
Strig str2 = String.join("", list);
System.out.println(str2);

