//public boolean canRead()
//public boolean canWrite()
//public boolean canExecute()
//public boolean isAbsolute()
//public boolean isDirectory()
//public boolean isFile()
//public boolean isFile()
//public boolean isHidden()
//public long lastModified()
//public long length()
//public boolean exists()

File file = new File("chap5/data/fsfile1.txt");
System.out.println("R: " + file.canRead());
System.out.println("W: " + file.canWrite());
System.out.println("E:" + file.canExecute());
System.out.println("APATH: " + file.isAbsolute());
System.out.println("DIR: " + file.isDirectory());
System.out.println("FILE: " + file.isFile());
System.out.println("HFILE:" + file.isHidden());
System.out.println("DATE: " +
		new Date(file.lastModified()).toString());
System.out.println("LENGTH: " + file.length());
System.out.println("EXSIT: " + file.exists());


