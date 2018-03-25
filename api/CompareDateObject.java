//public boolean after()
//public boolean before()
//public int compareTo()
//public boolean equals()

Date date1 = new Date();

Date date2 = new Date(date1.getTime() + 1000);
System.out.println(date1.after(date2));
System.out.println(date1.before(date2));
System.out.println(date1.equals(date2));
System.out.println(date1.compareTo(date2));


