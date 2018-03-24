//public long getTotalSpace()
//public long getFreeSpace()
//public long getUsableSpace()


File file = new File("chap5/data");

System.out.println("V SIZE: " +
		file.getTotalSpace() / 1024 / 1024 / 1024f + "(GB)");
System.out.println("FREE SPACE" +
		file.getFeeSpace() / 1024 / 1024 / 1024f + "(GB)");
System.out.println("USE SPACE" +
		file.getUsableSpace() / 1024 /1024 / 1024f + "(GB)");

