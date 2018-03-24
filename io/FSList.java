//public String[] list([FilenameFilter filter])
//public File[] listFiles([FilenameFilter filter])
//public File[] listFiles(FileFilter filter)
//public static File[] listRoots()

File dir = new File("chap5/data/");
String[] list = dir.list();
for(String tmp : list)
  System.out.println("FILE LIST: " + tmp);
for(File tmp : File.listRoots())
  System.out.println("ROOT LIST: " + tmp.getAbsolutePath());


