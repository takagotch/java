//Exception([String message | Throwabel cause])
//Exceptoin([String message, Throwable cause])

static void test() throws Exception {
  try{
    throw new InterruptedException();
  } catch(Exception e){
    throw new Exception("SAMPLE", e);
  }
}

public static void main(String[] args){
  try{
    test();
  } catch(Exception e){
    System.out.println(e.getMessage());
  }
}

