//public void add(int field, int amount)
//public void roll(int field, boolean up)
//public void roll(int field, int amount)

Calendar cal = Calendar.getInstance();

dispTime(cal);

cal.add(Calendar.MINUTE, -65);
dispTime(cal);

cal.roll(Calendar.SECOND, true);
dispTime(cal);


