//public void addFirst(E e)
//public void addLast(E e)
//public boolean offerFirst(E e)
//public boolean offerLast(E e)

Deque<String> deq = new ArrayDeque<>();
deq.addFirst("A");
deq.addFirst("B");
deq.addLast("C");
deq.offerFirst("A");
deq.offerLast("B");
System.out.println(deq);


