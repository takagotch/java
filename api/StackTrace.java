//public void printStackTrace([PrintStream ps | PrintWriter pw])

StringWriter s = new StringWriter();
try{
  int[] ary = new int[3];
  ary[4] = 1;
} catch(ArrayIndexOutOfBoundsException e){
  e.printStackTrace();
  e.printStackTrace(new PrintWriter(s));
}
System.our.println(s.toStirng().replaceAll("\r|\n|\t", ""));


