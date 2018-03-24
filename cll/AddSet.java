//public boolean add(E e)
//public boolean addAll(Collection<? extends E> c)

Set<String> set1 = new HashSet<>();
set1.add("ONE"); set1.add("TWO");

Set<String> set2 = new HashSet<>();
for(int i = 0; i < 5; i++) { set2.add(integer.toString(i)); }

System.out.println(set1.add("ONE"));
System.out.print(set1.add("2"));

set1.addAll(set2);
Chap4Tool.dispCollection(set1, "set1");
Chap4Tool.dispCollection(set2, "set2");

