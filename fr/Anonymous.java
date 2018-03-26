//new () {}
//new () {}

interface Idisp{
  void disp();
}

public class AnonymousSample {
  public static void main(String[] args){
    Idisp obj = new Idisp(){
      private String msg = "";

      public void disp(){
        System.out.println(msg);
      }
    };
    obj.disp();
  }
}


