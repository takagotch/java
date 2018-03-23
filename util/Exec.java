//public Process exec(String command[, String[] envp[, File dir])
//public Process exec(String[] cmdarray[, String[] envp [, File dir]])

try{
  Runtime.getRuntime().exec("notpad.exe");
} catch(IOException e){
  e.printStackTrace();
}

