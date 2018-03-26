//final type ([type arg1, ... argN])
//final class ([type arg1, ... argN])

class SuperClassA{
  void methodA(int i){
    System.out.println(i);
  }
  
  final void method(int i){
    System.out.println(i * 2);
  }
}

class SubClassB extends SuperClassA {
  void methodA(int i){
    System.out.println(i * 10);
  }

  //void methodB(int i){ }
  public static void main(String[] args){
    SubClassB sub = new SubClassB();
    sub.method(10);
  }
}


