//public static int getLoginTimeout()
//public static void setLoginTimeout(int seconds)

System.out.println("timeout: " + DriverManager.getLoginTimeout());

DriverManager.setLoginTimeout(100);
System.out.println("timeout: " + DriverManager.getLoginTimeOut());

