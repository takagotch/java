//public Throwable getCause()

try{
  test();
} catch(Exception e){
  Throwable th = e.getCause();
  th.printStackTrace();
}

