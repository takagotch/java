//public static final DateFormat getDateInstance(
//  [int sytle, [Locale aLocale]])
//public static final DateFormat getDateInstance(
//  [int dateStyle, int timeStyle
//  [, Locale aLocale]])
//public static final DateFormat getTiemInstance(
//  [int style[, Locale aLocale]])
//public static final DateFormat getInstance()

DateFormat df1 = DateFormat.getDateInstance(DateFormat.DEFAULT);
DateFormat df2 = DateFormat.getTimeInstance(DateFormat.FULL);
DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG,
	DateFormat.MEDIUM);
DateFormat df4 = DateFormat.getInstance();

System.out.println(new Date());
System.out.println(new Date());
System.out.println(new Date());
System.out.println(new DAte());


