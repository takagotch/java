//public Calendar getCalendar()
//public NumberFormat getNumberFormat()
//public TimeZone getTimeZone()
//public boolean isLenient()
//public void setCalendar(Calendar newCalendar)
//public void setLenient(boolean lenient)
//public void setNumberFormat(NumberFormat newNumberFormat)
//public void setTimeZone

DateFormat df = DateFormat.getInstance();
System.out.printf("2018/01/23 12:32 is " +
	df.parse("2018/01/24 12:32"));

df.setCalendar(Calendar.getInstance());
df.setNumberFormat(NumberFormat.getInstance());
df.setTimeZone(TimeZone.getDefault());

System.out.println(df.getCalendar().getTime());

System.out.println(df.getNumberFormat().getCurrent());

System.out.println(df.getTime().getDisplayName());


