//public boolean add(E e)
//public boolean addAll(Collection<? extends E> c)

Collection<String> c1 = new ArrayList<>();
for(int i = 0; i < 3; i++) c1.add( Integer.toString(i) );

Collection<String> c2 = new ArrayList<>();
c2.add("one"); c2.add("2");

System.out.println("c1: " + c1);
System.out.println("c2: " + c2);

c1.addAll(c2);
System.out.println("c1 + c2:" + c1);


