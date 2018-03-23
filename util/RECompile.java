//public static Pattern compile(String regex[, int flags])
//public int flags()
//public Macher matcher(CharSequence input)
//public String pattern()

String str = "STR";
Pattern pattern = Pattern.compile(".*java.*",
	Pattern.CASE_INSENSITIVE);
Matcher matcher = pattern.matcher(str);
System.out.println("STR: " + str);
System.out.println("OPTION: " + pattern.flags());
System.out.println("MATCH: " + matcher.matches());


