//public E getFirst()
//public E getLast()
//public E peekFrist()
//public E peekLast()

Deque<> deq = new ArrayDeque<>();
deq.addFirst(); deq.addFirst();
System.out.println();
try{
  System.out.println(deq.getFirst());
  deq.clear();
  System.out.println(deq.peekFirst());
  System.out.println(deq.getLast());
} catch(Exception e){
  //deq.getLast();
}

