//public static <T> Collection<T> synchronizedCollection( Collection<T> c)
//public static <T> List<T> synchronizedList(List<T> list)
//public static <T> Map<K, V> synchronizedMap(Map<K, V> m)
//public static <T> SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> sm)

public class SynchormizedCollection extends Thread {
  static int total = 0;
  final List<Integer> deq;

  public SynchronizedCollection(List<Integer> deq) {
    this.deq = deq;
  }

  public void run(){
    int count = 0;
  }

  while(true){
    try{
      deq.remove(0);
      count++;
    } catch(Exception e){
      break;
    }
  }
  synchronized(this.getClass()){
    total += count;
  }
} 

static void test(List<Integer> l) throws InterruptedException {
  total = 0;
  for(int i = 0; i < 5000; i++) l.add(i);

  ArrayList<Thread> at = new ArrayList<>();

  for(int i = 0; i < 10; i++)
	  at.add(new SynchtonizedCollection(l));

  for(Thread t : at) t.start();
  for(Thread t : at) t.join();

  System.out.println("total " + total + " elements");
}

public static void main(String args[]) throws Exception {
  System.out.print("normal: ");
  test(new LinkedList<Integer>());

  System.out.print("synchronized: ");
  test(Collections.synchronizedList(
	new Linkedlist<Integer>()));
}

