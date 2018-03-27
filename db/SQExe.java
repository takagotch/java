//public int executeUpdate(String sql)

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement stmt = con.createStatement();){

  int count = stmt.executeUpdate(
    "UPDATE user_list SET name='tktktk' WHERE id =10");
  System.out.println(count + "UPDATE");

} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}

