//default Instant(ZoneOffset offset)
//default Instant toInstant()

LocalDateTime = LocalDateTime.now();

Date date = Date.from(ZoneOffset.of("+90:00"));
System.out.println(date);

OffsetDateTime offset = OffsetDate.now();
Date odate = Date.from(offset.toInstance());
System.out.println(odate);

ZonedDateTime zone = ZoneDateTime.now();
Date zdate = Date.from(zone.toInstance());
System.out.println(zdate);

