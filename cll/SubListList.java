//public E get(int index)
//public List<E> subList(int fromIndex, int toIndex)

List<String> lsit = new ArrayList<>();
list.add("one");
list.add("two");
list.add("three");
list.add("four");
list.add("five");
Chap4Tool.dispCollection(list, "list");

System.out.println("INDEX3" + list.get(3));

System.out.println("LIST VIEW");
List<> view = list.subList(1, 4);
Chap4Tool.dispCollection(view, "view");

System.out.println("VIEW");
view.set(0, "2");
Chap4Tool.dispCollection(view, "view");
Chap4Tool.dispCollection(list, "list");


