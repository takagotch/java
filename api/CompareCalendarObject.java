//public boolean after(Object when)
//public boolean before(Object when)
//public boolean equals(Object when)

Calendar cal1 = Calendar.getInstance();
Calendar cal2 = Calendar.getInstance();
cal2.add(Calendar.YEAR, 1);

System.out.println("cal1 is equal cal2 ?:" + cal1.equals(cal2));
System.out.println("cal1 is after cal2 ?:" + cal1.after(cal2));
System.out.println("cal1 is before cal2 ?:" + cal1.before(cal2));

//public int getGreateestMinimum(int field)
//public int getLeastMaximum(int field)
//public int getMaximum(int field)
//public int getMinimum(int field)


