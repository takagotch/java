//public Comparator<> comparator()

Collator collator = Collator.getInstance();
SortedSet<String> set = new TreeSet<>(collator);
set.add("", "");
set.add("", "");
set.add("", "");
Iterator<?> iterator = set.iterator();
while(iterator.hasNext()){
  System.out.println(iterator.next());
}
System.out.println("COMPARATER: " + set.comparator());

