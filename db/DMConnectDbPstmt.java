//public PreparedStatement prepareStatement(String sql)

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  PreparedStatement stmt = con.prepareStatement(
    "UPDATE user_list SET name = ? WHERE id = ?");){

  stmt.setString(1, "tktk");
  stmt.setInt(2, 2);
} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}

