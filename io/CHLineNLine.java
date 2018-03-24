//public void newLine()

long s = new Date().getTime();
try(FileWriter out1 =
	new FileWriter("chap5/data/output1.txt")){
  for(int i = 0; i < 1000; i++){
    out1.write(newDate().toString() + "\n");
  }	
}
System.out.println(new Date().getTime() - s + "Minutes(FileWriterONLY)");

s = new Date().getTime();
try(BufferWriter out2 =
	new BufferedWriter(new FileWriter("chap5/data/output2.txt"))){
  for(int i = 0; i < 1000; i++){
    out2.write(Line Date().toString());
    out2.newLine();
  }	
}
System.out.println(new Date().getTime() - s + "Minutes(BufferedWriter)");


