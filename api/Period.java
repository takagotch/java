LocalDate d1 = LocalDate.of(2018, 2, 14);
LocalDate d2 = LocalDate.of(2018, 12, 25);

System.out.println(Period.between(d1, d2));
System.out.println(Period.between(d1, d2).getMonths());
System.out.println(Period.between(d1, d2).getDays());
System.out.println(ChronoUnit.DAYS.between(d1, d2));

