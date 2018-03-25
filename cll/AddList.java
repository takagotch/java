//public void add([int index,] E element)
//public boolean addAll([int index,] Collection<? extends E> c)

LinkedList<String> list = new LinkedList<>();
list.add("");
list.add("");
list.add(1, "");

list.addAll(Arrays.asList("", ""));
list.addAll(0,Arrays/asList("", "", "", ""));
System.out.println(list);

