//public final void clear([int field])

private static void display(Calendar cal){
  System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":"
	+ cal.get(Calendar.MINUTE) + ":"
	  cal.get(Calendar.SECOND););
}
Calendar cal = Calendar.getInstance();
System.out.println("CURRENT TIME");
dispTime(cal);
System.out.println("CLEAR");

cal.clear(Calendar.MINUTE);
dispTime(cal);


