//public class static {} {}

class SuperClass {
  static {
    System.out.println("SuperClass static");
  }
  {
    System.out.println("SuperClass ");
  }
  SuperClass(){
    System.out.println("SuperClass ");
  }
}

class SubClass extends SuperClass{
  static{
    System.out.println("SubClass static");
  }
  {
    System.out.println("SubClass");
  }

  SubClass(){
    System.out.println("SubClass");
  }
}

public class InitializerSample{
  public static void main(String[] args){
    System.out.println("");
    SubClass c1 = new SubClass();

    System.out.println("");
    SubClass c2 = new SubClass();
  }
}

