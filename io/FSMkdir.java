//public boolean mkdir()
//public boolean mkdirs()

File dir1 = new File("chap5/data/subDir1");
File dir2 = new File("chap5/data/subDir2/tmp/tmp");

System.out.println(dir1 + "CREATE: " + dir1.mkdir());
System.out.println(dir2 + "CREATE: " + dir2.mkdirs());
System.out.println("EXSIST?: " + dir2.exists());


