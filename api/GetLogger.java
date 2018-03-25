//public static Logger getLogger(String name [, String bundleName])

Logger logger1 = Logger.getLogger("sample");
Logger logger2 = Logger.getLogger("sample");

System.out.println(logger1.equals(logger2));


