//public void add(E e)
//public void set(E e)

List<String> list = new ArrayList<>();
list.add("noon"); list.add("evening");
System.out.println(list);

ListIterator<String> iterator = list.listIterator();
iterator.add("morning");
System.out.println(list);

iterator.next();
iterator.set("afternoon");
System.out.println(list);



