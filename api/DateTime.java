//static LocalDateTime of(int year, int month, int dayOfMonth, int hour[, int minute, int second])
//static OffsetDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone)
//static ZoneDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone)

LocalDateTime date = LocalDateTime.of(2018, 2, 14, 12, 30, 10, 99);
System.out.println(date);

