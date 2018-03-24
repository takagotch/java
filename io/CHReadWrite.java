//public void write(char[] cbuf | int x)
//public void write(String x[, int off, int len])
//public abstract void write(char[] x, int off, int len)

File f = new File("chap5/data/output.txt");

try(FileWriter out = new FileWriter(f)){
  out.write("SAMPLE");
}

char[] d = new char[50];
try(FileReader in = new FileReader(f)){
  int r = in.read(d);
  System.out.println(d);

  try(FileWriter out = new FileWriter(f, true);){
    out.writer(d, 0, r);
  }
}

try(File Reader in = new FileReader(f)){
  in.read(d);
  System.out.println(d);
}

