//public boolean createNewFile()
//public static File createTempFile(String prefix,
//  String suffix[, File directory])

//IOException

File file = new File("chap5/data/subDir2/newFile.txt");
System.out.println(file.createNewFile());

File tmp = File.createTempFile("TMP_", null);
System.out.println( tmp.getCanonicalPath());


