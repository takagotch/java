//public String readLine()

File f = new File("chap5/data/output.txt");
try(FileWriter out = new FileWriter(f)){
  for(int i = 0; i < 1000; i++){
    out.write(new Date().toString() + "\n");
  }
}

try(BufferedReader in =
	new BufferedReader(new FileReader(f))){
	
	int line = 0;
	while(in.readLine() != null){
	  line++;
	}
	System.out.println("LINE: " + line);
}

