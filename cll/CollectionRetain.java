//public boolean retainAll(Collection<?> c)
//default boolean removeIf(Predicate<? super E> filter)

ArrayList<String> col1 =
  new ArrayList<>(Arrays.asList("A", "B", "C"));
ArrayList<String> col2 =
  new ArrayList<>(Arrays.asList("AA", "BB", "CC"));

col1.retainAll(col2);
System.out.println(col1);

col2.removeIf(s -> s.length() <2);
System.out.println(col2);

