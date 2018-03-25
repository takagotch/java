//public boolean isAfter(ChronoLocalDateTime<?> other)
//public boolean isBefore(ChronoLocalDateTime<?> other)
//public boolean isEqual(ChronoLocalDateTime<?> other)
//public int compareTo(ChronoLocalDateTime<?> other)

ZonedDateTime date1 = ZoneDateTime.now();
ZonedDateTime date2 = date1.plusMonths(3);

System.out.println(date1.compareTo(date2));
System.out.println(date1.isBefore(date2));
System.out.println(date1.isAfter(date2));
System.out.println(date1.isEqual(date2));

