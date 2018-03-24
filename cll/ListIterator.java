//ListIterator<E> listIterator([int index]) 

List<Integer> list = new ArrayList<>();
Random random = new Random();
for(int i = 0; i < 5; i++){
  list.add(random.nextInt(5));
}
Chap4Tool.dispCollection(list, "ListIterator");

ListIterator<Integer> iterator = list.listIterator();

ListIterator<> iterator = list.listIterator();
while(iterator.hasNext()){
  System.out.print("[" + iterator.nextIndex()+ "]" +
    iterator.next() + " ");
}

