class VLengthSample{

  void method(String... args){
    for(String s : args){
      System.out.println(s);
    }
  }

  public static void main(String[] args){
    VLengthSample v = new VLengthSample();
    v.method("a");
    v.method();
    v.method("a", "b", "c");
  }
}


