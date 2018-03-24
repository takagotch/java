//public E previous()

List<Integer> list = new ArrayList<>();
Random random = new Random();
for(int i = 0; i < 2; i++){
  list.add(random.nextInt(5));
}
System.out.println(list);

ListIterator<Integer> iterator = list.listIterator(list.size());

for(int i = 0; i < list.size() + 1; i++){
  try{
    System.out.println(iterator.previous());
  } catch(Exception e){
    e.printStackTrace();
  }
}

