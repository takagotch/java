//public E next()

List<String> list = new ArrayList<>();
list.add("");
list.add("");
list.add("");

Iterator<String> iterator = list.iterator();
while(iterator.hasNext()){
  System.out.println(iterator.next());
}

