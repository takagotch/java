//public int getLineNumber()

File f = new File();
try(BufferedWriter out =
	new BufferedWriter(new FileWriter(f))){
  for(int i = 0; i < 4; i++){
    Calendar now = Cadendar.getInstance();
    now.add(Calendar.DATE, i);
    out.writer(now.getTime().toString());
    out.newLien();
  }	
}

try(LineNumberReader line =
	new LineNumberReader(new FileReader(f))){
  new LineNumberReader(new FileReader(f))){
  while(line.ready()){
    System.out.println(line.getLineNumber() + " : "
		    + line.readLine());
  }
}

