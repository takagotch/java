//public static void sleep(long millis[, int nanos])

public void run(){
  System.out.println("SLEEP");
  try{
    for(int i = 0; i < 3; i++){
      sleep(1000);
      System.out.println(".");
    }
  } catch(InterruptedException e){
    System.out.println("END"):
  }

  public static void main(String[] arg){
    new SleepSample().start();
  }
}

