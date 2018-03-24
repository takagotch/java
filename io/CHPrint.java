//public void print(type v)
//public void println([type v])

try(OutputStreamWriter os = new OutputStreamWriter(System.out)){
  PrintWriter out = new PrintWriter(new BufferedWriter(os));
  out.print("boolean" + true);
  out.print(" char:" + 'a');
  out.print(" int:" + 1);
  out.print(" double" + 0.1);
  out.println("\n");
  out.print("String" + "string");
}

