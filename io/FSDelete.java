//public boolean delete()
//public void deleteOnExit()


File dir1 = new File("chap5/data/subDir1");
System.out.println(dir1 + "CREATEL: " + dir1.mkdir());
dir1.delete();
System.out.println("EXSIST?: " + dir1.exsists());
dir1.delete();
System.out.println(dir1 + "DELETE: " + dir1.delete());
System.out.println("EXSIST?: " + dir1.exsits());

