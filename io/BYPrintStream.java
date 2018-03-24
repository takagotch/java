//public boolean checkError()
//public void print(type v)
//public void println([type v])

String[] mes = { "", "", "" };
try(
  PrintStream ps =
  new PrintStream(
	  new BufferedOutputStream(
		  new FileOutputStream("chap5/data/byPrint.txt")))){
	int size = mes.length;
	for(int i = 0; i < size; i++){
	  ps.println(mes[i]);
	}
	for(int i = 0; i < size; i++){
	  ps.print(mes[i]);
	}
	if(ps.checkError()){
	  System.out.println("ERR");
	}
} catch(Exception e){
  e.printStackTrace();
}

