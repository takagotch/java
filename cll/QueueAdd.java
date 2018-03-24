//public boolean add(E e)
//public boolean offer(E e)

LinkedBlockingDeque<String> queue = new LinkedBlockingDeque<>(2);

System.out.println("add A:" + queue.add("A"));
System.out.println("add B: " + queue.add("B"));
try{
  System.out.println("add C: " + queue.add("c"));
} catch(Exception e){
  System.out.prinln("EER: " + e.getMessage())
}
System.out.println("add C: " + queue.offer("C"));

