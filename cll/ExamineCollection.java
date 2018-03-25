//boolean equals(Object o)

Collection<String> col1 = new ArrayList<>();
col1.add("1");

Collection<String> col2 = new ArrayList();
col2.add("1");
col2.add("2");

System.out.println("EQUAL: " + col2.equals(col1));
col2.remove("2");
System.out.println("EQUAL: " + col2.equals(col1));

//public boolean contains(Object o)
//public boolean conatins(Collection<?> c)
//public boolean isEmpty()

Collection<String> col1 = new ArrayList<>();
for(int i = 0; i < 3; i++) col1.add(Integer.toSting(i));

Collection<String> col2 = new ArrayList<>();
col2.add("one"); col2.add("two");
col1.addAll(col2);

System.out.println("col1: " + col1);
System.out.println("col2: " + col2);

System.out.println(col2.contains("three"));
System.out.println(col1.containsAll(col2));
System.out.println(col2.isEmpty());
System.out.println(col2.equal(col1));


