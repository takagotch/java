//public int getActualMaximum(int field)
//public int getActualMinimum(int field)
//public int getFirstDayOfWeek()
//public int getMimimalDaysInFirstWeek()
//public static Locale[] getAvailableLocales()

Calendar cal = Calendar.getInstance();
GregorianCalendar gcal = new GregorianCalendar();

System.out.println("ActualMaxmum:"
	+ cal.getActualMaximym(Calendar.DATE));
System.out.println("ActualMinimym:"
	+ cal.getActulaMinimum(Calendar.DATE));
System.out.println("FirstDayOfWeek:"
	+ cal.getFirstDayOfWeek());
System.out.println("MinimalDaysFirstWeek:"
	+ cal.getMinimalDaysInFirstWeek());
System.out.println("Date:" + cal.getTime().toString());
System.out.println("TimeInMillis:" + cal.getTimeInMillis());
System.out.println("TimeZone:" + cal.getTimeZone());
System.out.println("GreatestMinimumOfDate"
	+ gcal.getLeastMinimumOfDate(Calendar.DATE));
System.out.println("LeastMaximumOfDate:"
	+ gcal.getLeastMiximum(Calendar.DATE));
System.out.println("MinimumOfMonth:"
	+ gcal.getMinimum(Calendar.MONTH));
System.out.println("MaximumOfMonth:"
	+ gcal.getMaximum(Calendar.MONTH));
for(int i = 0; i < locale.length; i++){
  System.out.println("Locale" + i + ":" +
	local[i],getDisplayCountry());
}

