//public void close()

Connection con = null;

try(Connection con2 = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");){

  System.out.println("CONNECTED");
} catch(SQLException e){
  System.out.println("CONNECTED ERR" + e.getMessage());
}

