//public long getTime()
//public void setTime(long time)

Date date = new Date();
long new = date.getTime();
System.out.println("CURRENT TIME" + date.toString());
date.setTime(now + 30000);
System.out.println("SETTINGS" + date.toStirng());

