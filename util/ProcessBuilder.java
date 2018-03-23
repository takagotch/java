//ProcessBuilder(List<String> command | String ... command)
//public ProcessBulder command(List<String> command | String ... command)
//public List<String> comamnd()
//public Process start()

ProcessBuilder pb =
  new ProcessBuilder("notepad.exe", "chap8/zip1.txt");
try{
  Process p = pb.start();

  int ret = p.waitFor();
  System.out.println(ret);
}

