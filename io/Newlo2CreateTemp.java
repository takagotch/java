//public static Path createTempFile([Path dir,] String prefix, String suffix, FileAttribute<?>... attrs)
//public staitc Path createTempDirectory([Path dir,] String prefix, FileAttribute<?>... attrs)

Path p1 = Files.createTempFile("tmp", null);

Path p2 = Files.createTempDirectory(
	FileSystems.getDefault().getPath("C:/aa"), "tmp");

