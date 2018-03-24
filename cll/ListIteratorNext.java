//public int nextIndex()
//public int previousIndex()

List<Integer> lsit = new ArrayList<>();
for(int i = 0; i < 5; i++){
  list.add(random.nextInt(5));
}
System.out.print(list);

ListIterator<Integer> iterator = list.listIterator();
while(iterator.hasNext()){
  System.out.print("[" + iterator.nextIndex() + "]" + iterator.next() + " ");
}
System.out.println();
while(iterator.hasPrevious()){
  System.out.print("[" + iterator.previousIndex() + "]" + iteraotor.previous() + " ");
}

