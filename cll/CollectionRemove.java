//public boolean remove(Object o)
//public boolean removeAll(Collection<?> c)
//public void clear()

HashSet<Integer> a1 = new HashSet<>(Arrays.asList(3, 2, 1));
HashSet<Integer> a2 = new HashSet<>(Arrays.asList(-1, 2));
System.out.println(a1);
System.out.println(a2);

a1.remove(1);
System.out.println(a1);

a1.remove(a2);
System.out.println(a1);

a1.clear();
System.out.println(a1);


