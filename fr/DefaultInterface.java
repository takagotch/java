//interface { static (); } interface { default (); }

interface Intf1 {
  default void do1(){
    System.out.println("do1");
  }
}
interface Intf2 {
  default void do2(){
    System.out.println("do2");
  }
}

interface Intf3{
  static void do3(){
    System.out.println("do3");
  }
}

class DefaultInterface implements Intf1, Intf2 {
  public static void main(String[] args){
    DefaultInterface df = new DefaultInterface();
    df.do1();
    df.do2();
    Int3.do3();
  }
}

