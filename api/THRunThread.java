//public void run()

public class THRunThreadSample extends Thread {
  public static void main(String[] args){
    for(itn i = 0; i < 3; i++){
      new THRunThreadSample("Thread" + i).start();
    }
  }

  public THRunThreadSample(String name){
    for(int i = 0; i < 3; i++){
      System.out.println(getName() + ":" + i);
    }
  }
}



