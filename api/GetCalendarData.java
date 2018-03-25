//GregorianCalendar([int year, int month, int dayOfMonth [, int hourOfDay, int minute[, int second]]])
//GregorianCalendar(Locale aLocale)
//GregorianCalendar(TimeZone zone[, Locale aLocale])

GregorianCalendar gcal = new GregorianCalendar(2000, 4, 22);
System.out.println(gcal.get(Calendar.YEAR) + "/" +
	(gcal.get(Calendar.MONTH) + 1) + "/" +
	gcal.get(Calendar.DATE));


//public static Calendar getInstance([Locale aLocale])
//public static Calendar getInstance(TimeZone zone [, Locale aLoacale])

Calendar cal = Calendar.getInstance();
System.out.println("TODAY");

System.out.println(cal.get(Calendar.YEAR) + "/" +
	(cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.DATE));

Calendar cal2 = Calendar.getInstance(Locale.FRANCE);

System.out.println(cal2.getFirstDayOfWeek() == Calendar.SUNDAY);




