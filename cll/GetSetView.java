//public SortedSet<> headSet()
//public SortedSet subSet()
//public SortedSet tailSet()

SortedSet<Integer> set = new TreeSet<>();
for(int i = 0; i < 5; i++){
  set.add(i + 1);
}
SortedSet<Integer> view = set.headSet(3);
Iterator<?> iterator = view.iterator();
System.out.println("VIEW");
while(iterator.hasNext()){
  System.out.println("set VIEW: " + iterator.next());
}
System.out.println("VIEW 0 ADD");
view.add(new Integer(0));
System.out.println("SET");

iterator = set.iterator();
while(iterator.hasNext()){
  System.out.println("set: " + iterator.next().toString());
}


