//public Statement createStatement([int resultSetType, int resultSetConcurrency])

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement stmt = con.createStatement();){

  System.out.println(stmt.execute("SELECT * FROM user_list"));

} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}

