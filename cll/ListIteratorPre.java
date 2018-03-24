//public boolean hasPrevious()

List<Intefer> list = new ArrayList<>();
Random random = new Random();

for(int i = 0; i < 3; i++){
  list.add(random.nextInt(5));
}
System.out.println(list);

ListIterator<Integer> iterator = list.listIterator(list.size());
while(iterator.hasPrevious()){
  System.out.println(iterator.previous());
}


