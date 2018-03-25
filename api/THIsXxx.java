//public static boolean interrupted()
//public boolean isInterrupted()
//public final boolean isAlive()
//public final void checkAccess()
//public static boolean holdsLock(Object obj)
//public final boolean isDaemon()

public class THIsXxxSample extends Thread {
  public static void main(String[] args){
    THIsXxxSample t = new THIsXxxSample("thread");
    System.out.println("getState: " + t.getState().toString());
    t.start();
    t.join();
    System.out.println("getState: " + t.getState().toString());
  }

  public THIsXxxSample(String name){
    super(name);
  }

  public void run(){
    System.out.println("holdsLock: " +
	Thread.holdsLock(new Obj()););
    System.out.println("interrupted" + Thread.interrupted());
    System.out.println("isAlive: " + isAlive());
    System.out.println("isDaemon: " + isDaemon());
    System.out.println("isInterrupted: " + isInterrupted());
    System.out.println("getState: " + getState().toString());
  }
}

class Obj {
  private int value = 1;
  public int getValue(){
    return this.value;
  }
}


