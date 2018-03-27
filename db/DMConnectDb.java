//public static Connection getConnection(String url [, Properties info])
//public static Connection getConnection(String url, String user, String password)

Connection con = null;
try{
  con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  System.out.println("CONNECTED");
}

