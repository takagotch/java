public class LambdaSample {
  public static void main(String[] args){
    Runnable runner1 = () -> {
      List<Integer> list = Arrays.asList(4, 0, 8, 2, -5);

      Collections.sort(list,
	(o1, o2) -> { return Integer.compare(o1, o2);}
      );
      list.forEach(s -> System.out.println(s));
    };

    Thread t1 = new Thread(runner1);
    t1.start();
    try{
      t1.join();
    } catch(InterruptedException e){
    }
    System.out.println("");
  }
}


