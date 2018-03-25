//public static LocalDateTime ofInstant()
//public static ZoneDateTime ofInstant()
//public static OffsetDateTime ofInstant()

Date date = new Date();
System.out.println(date);

LocalDateTime date1 = LocalDateTime.ofInstatn(date.toInstant(),
	ZoneId.systemDefault());
ZoneDateTime date2 = ZonedDateTime.ofInstant(date.toInstant(),
	ZoneId.systemDefault());
OffsetDateTime date3 = OffsetDateTime.ofInstant(date.toInstatnt(),
	ZoneId.systemDefault());

System.out.println(date1);
System.out.println(date2);
System.out.println(date3);


