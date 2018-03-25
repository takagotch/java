//public Iterator<E> iterator()

Collection<Character> collection = new ArrayList<>();

char[] c = "Hello".toCharArray();
for(char tmp : c){
  collection.add( tmp );
}

Iterator<?> iterator = collection.iterator();

while(iterator.hasNext()){
  System.out.print(iterator.next() + ",");
}


