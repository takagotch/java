//public static void dumpStack()
//public StackTraceElement[] getStackTrace()

public void run(){
  System.out.println("THREAD");
  System.out.println("- dumpStack -");
  System.out.println();
  System.out.println("- getStackTrace -");
  for(StackTraceElement s : getStackTrace())
	  System.out.println(s);
}

public static void main(String[] arg){
  new DumpStackSample().start();
}

