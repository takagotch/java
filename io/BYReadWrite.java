//public FileInputStream(File file | String name)
//public FileInputStream(FileDescriptor fbObj)

try(FileInputStream in = new FileInputStream(FileDescriptor.in)){
  System.out.pringf("%X", in.read());
}


