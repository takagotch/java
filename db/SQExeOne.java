//public ResultSet executeQuery(String sql)

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement stmt = con.createStatement(;){

  ResultSet rs1 = stmt.executeQuery("SELECT * FROM user_list");
  while(rs1.next()){
    System.out.println(rs1.getInt("id") + " " +
      rs1.getString("name"));
  }
} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}

