//public String getFileName()
//public int getLineNumber()
//public String getClassName()
//public String getMethodName()

try { test(); } catch(Exception e){
  for(StackTraceElement el2 : e.getStackTrace()){
    System.out.println("LINE: " + el2.getLineNumber());
    System.out.println("FILE: " + el2.getFileName());
    System.out.println("CLASS: " + el2.getClassName());
    System.out.println("METHOD:" + el2.getMethodName());
  }
}

