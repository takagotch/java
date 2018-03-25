//public static int activeCount()
//public static int enumerate(Thread[] tarray)

public class THActiveEnumerateSample extends Thread {
  public void run(){
    try{
      Thread.sleep((int) (Math.random() * 1000));
    } catch(InterruptedException e) { }
  }

  public static void main(String[] args){
    for(int i = 0; i < 2; i++){
      new THActiveEnumerateSample().start();
    }

    Thread[] tarry = new Thread[Thread.activeCount()];

    Thread.enumrate(tarry);
    for(Thread tmp : tarry){
      System.out.print(tmp.getName() + " ");
    }
  }
}

