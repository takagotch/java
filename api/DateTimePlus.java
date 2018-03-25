//public LocalDateTime plus(long amount, TemporalUnit unit)
//public LocalDateTime plusYears(long amount)
//public LocalDateTime plusMonths(long amount)
//public LocalDateTime plusWeeks(long amount)
//public LocalDateTime plusDays(long amount)
//public LocalDateTime plusHours(long amount)
//public LocalDateTime plusMinutes(long amount)
//public LocalDateTime plusSeconds(long amount)
//public LocalDateTime plusNanos(long amount)
//public LocalDateTime minus(long amount, TemporalUnit unit)
//public LocalDateTime minusYears(long amount)
//public LocalDateTime minusMonths(long amount)
//public LocalDateTime minusWeeks(long amount)
//public LocalDateTime minusDays(long amount)
//public LocalDateTime minusHours(long amount)
//public LocalDateTime minusMinutes(long amount)
//public LocalDateTime minusSeconds(long amount)
//public LocalDateTime minusNanos(long amount)
//public LocalDateTime plus(TemporalAmount tamount)
//public LocalDateTime minus(TemporalAmount tamount)

LocalDateTime date1 = LocalDateTime.parse("2018-11-12T11:03");

System.out.println(date1.plusMonths(3));

System.out.println(date1.minusDays(20));

System.out.println(date1.plus(15, ChronoUnit.HOURS));

Period period = Period.of(1, 2, 3);

System.out.println(period);

Duration duration = Duration.of(60, ChronoUnit.MINUTES);

System.out.println(date1.plus(duration));

