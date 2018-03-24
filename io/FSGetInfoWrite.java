//public boolean setWriteable(boolean b
//  [, boolean ownerOnly])
//public boolean setReadable(boolean b
//  [, boolean ownerOnly])
//public boolean setExecutable(boolean b
//  [, boolean ownerOnly])

File file = new file("chap5/data/isfile.txt");

System.out.println("W" + file.setWriteable(true, true));
System.out.println("R" + file.setReadable(true));
System.out.println("E" + file.setExecutable(false));

