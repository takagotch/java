//public final Date getTime()
//public long getTimeInMillis()
//public TimeZone getTimeZone()
//public void setTime(Date date_obj)
//public void setTimeInMillis(long millis)
//public void setTimeZone(TimeZone value)

private static void display(Calendar cal){
  System.out.println(cal.get(Calendar.YEAR) + ":" +
	(cal.get(Calendar.MONTH) + 1) + ":" + cal.get(Calendar.DATE));
}

Calendar cal = Calendar.getInstance();
Date date = new Date();
TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
System.out.println("TODAY");
dispDate(cal);

System.out.println("2001.1.1");
cal.set(2001, 1, 1);
dispDate(cal);
System.out.println("DATE OBJ");
cal.setTime(date);
dispDate(cal);
System.out.println("WEEK");
cal.setFirstDayOfWeek(Calendar.MONDAY);
if(cal.getFirstDayOfWeek() == Calendar.MONDAY){
  System.out.println("WEEK");
}
System.out.println("MIN 7");
cal.setMinimalDaysInFirstWeek(7);
System.out.println("" +
  cal.getMinimalDaysInFirstWeek() + "DAY");
System.out.println("US/Los");
cal.setTimeZone(tz);
System.out.println("Tz" +
  cal.getTimeZone().getDisplayName());



