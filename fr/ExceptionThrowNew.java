//throw new EXCEPTION;

public class ExceptionThrowNew {
  static void throwSample() throws IllegalAccessException {
    System.out.println("throwSample");

    throw new IllegalAccessException("demo");
  }

  public static void main(String[] args){
    try{
      throwSample();
    } catch(IllegalAccessException e){
      System.out.println(e);
    }
  }
}


