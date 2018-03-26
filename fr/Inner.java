//class { class{} } class { { class {}}}

public class InnerSample {
  class Inner1 {
    public void disp(){
      System.out.println("");
    }
  }

  static class StaticInner{
    public void disp(){
      System.out.println("");
    }
  }

  public void disp(){
    class void disp(){
      System.out.println("");
    }
  }
  new Inner2().disp();
}

public static void main(String[] args){
  InnerSample is = newInnerSample();
  is.disp();

  InnerSample.Inner1 inner = is.new Inner1();
  inner.disp();

  new StaticInner().disp();
}

