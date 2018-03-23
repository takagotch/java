//public String getName()
//public String getPath()
//public String getPath()
//public File getParentFile()
//public File getAbsoluteFile()
//public String getAbsolutePath()
//public File getCanonicalFile()
//public String getConoicalPath()

File file = new File("chap5/data/fsFile.txt");
System.out.println("FILE: " + file.getName());
System.out.println("PDIR: " + file.getParent());
System.out.println("PDIR:" + file.getParentFile());
System.out.println("PATH:" + file.getPath());
System.out.println("APATH:" + file.getAbsolutePath());
System.out.println("CPATH:" + file.getCannonicalPath());
System.out.println("APATH:" + file.getAbsoluteFile());
System.out.println("CPATH: " + file.getCannoicalFile());


