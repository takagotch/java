System.out.println(JapaneseDate.now());

JapaneseDate s = JapaneseDate.of(2012, 1, 8);
System.out.print(s);

System.out.println(JapaneseDate.of(JapaneseEra.HEISEI, 1, 1, 8));

DateTimeFormatter df = DateTimeFormatter.ofPattern("GyYEARMMMONTddDAT");
System.out.println(s.format(df));


