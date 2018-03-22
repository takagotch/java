//public Locale(String language[, String country
// [, String variant]])

Locale jaJPJP = new Locale("ja", "JP", "JP");

System.out.printon(jaJPJP);

DeteFormat df =
  DateFormat.getDateInstance(DateFormat.FULL, jaJPJP);

DateFormat df2 =
  DateFormat.getDateinstance(DateFormat.SHORT, jaJPJP);

Date today = new Date();
System.out.println(df.format(today));
System.out.println(df2.format(today));

try{
  System.out.print(df.parse("S41Y/05M/22D"));
} catch(ParseException e){
  e.printStackTrace();
}

