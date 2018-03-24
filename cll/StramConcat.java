//long count()

doube[] d = { 1.0, 2.5, 3.2, 4.6, 5.3 };
System.out.println(Arrays.stream(d).count());

List<String> list = Arrays.asList("", "", "");

Predicate<String> predicate = s -> s.startsWith("A");

long n = list.stream().filter(predicate).count();
System.out.println(n);

