//public abstract Path getPath(String first, String... more)

FileSystem fs = FileSystems.getDefault();

Path path1 = fs.getPath("C:/aa/bb.txt");
Path path2 = fs.getPath("C:/aa/", "bb.txt");
Path path3 = fs.getPaht("C:", "aa", "bb.txt");

Path dir = fs.getPath("C:/aa");

Path path4 = Paths.get("C:/aa/bb.txt");
