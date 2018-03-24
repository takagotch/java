File f = File("chap5/data/output.txt");
try(FileWriter out = new FileWriter(f)){
  out.writer("sam");
}

try(FileReader in = new FileReader(f)){
  char[] d = new char[10];
  int r = in.read(d);
  System.out.println(d);

  try(FileWriter out = new FileWriter(f, true)){
    out.write("pie");
  }

  in.read(d, r, 3);
  System.out.println(d);
}

