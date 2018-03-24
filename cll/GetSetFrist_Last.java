//public E first()
//public E last()

SortedSet<Integer> set = new TreeSet<>();
for(int i = 0; i < 5; i++){
  set.add(i + 1);
}
System.out.println("FIRSRT: " + set.first());
System.out.println("LAST: " + set.last());

