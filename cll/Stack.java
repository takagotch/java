//void push(E e)
//E pop()
//E peek()

Deque<String> deq = new ArrayDeque<>();
deq.push("A"); deq.push("B");
System.out.println(deq);

System.out.println(deq.peek());

deq.push("C");

System.out.println(deq.pop());
System.out.println(deq);

