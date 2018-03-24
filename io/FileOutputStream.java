//public FileOutputStream(String name[, boolean append])
//public FileOutputStream(File file[, boolean append])
//public FileOutputStream(FileDescriptor fdObj)

try(FileOutputStream out =
	new FileOutputStream(FileDescriptor.err)){

  out.write(new byte[] { 'e', 'r', 'r' });
}


