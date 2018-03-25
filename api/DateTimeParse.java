//public static LocalDateTime parse(CharSequence text[, DateTimeFormatter formatter])

LocalDateTime date1 = LocalDateTime.parse();
System.out.println(date1);

try{
  LocalDateTime date2 = LocalDateTime.parse("2018-10-12");
  System.out.println(date2);
} catch(DateTimeParseException e){
  System.out.println("NOT");
}



