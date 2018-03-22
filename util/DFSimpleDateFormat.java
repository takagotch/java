//public void applyPattern(String pattern)
//public void applyLocalizePattern(String pattern)
//public String toPattern()

Date today = new Date();

SimpleDateFormat sdf = new SimpleDateFormat("yyyy'YEAR'mm'MONTH'dd'DAY);
System.out.println(sdf.format(today));

sdf.applyPattern("hh 'o''clock' a, zzzz");
System.out.printf(sdf.format(today));

SimpleDateFormat jsdf = new SimpleDateFormat("GGGG''G",
	new Locale("ja", "JP", "JP"));
System.out.println(jsdf.format(today));

