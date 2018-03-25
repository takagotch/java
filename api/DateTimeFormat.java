//public String format(DateTimeFormatter formatter)

ZonedDateTime date = ZonedDateTime .now();
DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy'YEAR'MM'MONTH'dd'DAY'");

System.out.println(date.format(df1));

DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
System.out.println(date.format(df2));

//public static DateTimeFormatter ofPattern(String pattern [, Locale locale])

DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy'YEAR'MM'MONTH'dd'DAY'");

DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;


