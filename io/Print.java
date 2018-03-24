//PrintWriter printf([Locale l,] String format,
//  Object ... args)

//%[argument_index][flags][width][.precision]conversion

System.out.printf("%d%n", 123);
System.out.printf("%d %3$d %2$d%n", 1, 2, 3);
System.out.printf("%x%n", 123);
System.out.printf("[%-4d]%n", 123);
System.out.printf("%tT%n", new Date());

