//public FileReader(String name | File file)
//public FileReader(FileDescriptor fdObj)

try(
  FileReader in - new FileReader(FileDescriptor.in);){
  
  int d = in.read();
  System.out.prinf("%c", d);
}

