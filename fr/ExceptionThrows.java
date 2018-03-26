//() throws {}

public class ExceptionThrows {
  static void methodSample() throws FileNotFoundException {
    FileReader exFile = new FileReader("aaaa.txt");
  }

  public static void main (String[] args){
    try{
      methodSample();
    } catch(FileNotFoundException e){
      System.err.println(e.getMessage());
    } finally {
      System.out.println("finally");
    }
  }
}

