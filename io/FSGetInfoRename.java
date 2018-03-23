//public boolean renameTo(File dest)
//public boolean setLastModified(long time)
//public boolean setReadOnly()

File org = new File("chap5/data/fsfile.txt");
System.out.println("RENAME: "
		+ org.renameTo(new File("chap5/data/new_fsFile.txt")));

File file = new File("chap5/data/fsFile.txt");
long tenMinBef = new Date().getTime() - 10 * 60 * 1000;
System.out.println("UPDATE RE TIME" + file.
		+ new Date(file.lastModified()).toString());
System.out.println("R: " + file.setReadOnly());


