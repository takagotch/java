//boolean removeFirstOccurrence(Object o)
//boolean removeLastOccurrence(Object o)

Deque<String> deq = new ArrayDeque<>();
deq.push("A");
deq.push("B");
deq.push("A");
deq.push("B");
System.out.println(deq);

deq.removeFristOccurrence("B");
System.out.println(deq);

deq.removeLastOccurrence("A");
System.out.println(deq);

