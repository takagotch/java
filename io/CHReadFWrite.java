//public FileWriter(String name[, boolean append])
//public FileWriter(File file[, boolean appned])
//public FileWriter(FileDescriptor fdObj)

File f = new File("chap5/data/output.txt");
try(FileWriter out = new FileWriter(f)){
  out.write("sample");
}

try(FileReader in = new FileReader(f)){
  System.out.println(in.read());
}

