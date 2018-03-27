//public void commit()
//public void rollback()

try(Connection con = DriverManaer.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement stmt = con.createStatement();){

  con.setAutoCommit(false);
  try{
    stmt.executeUpdate(
      "UPDATE user_list SET name = 'tk' WHERE id =3");
    stmt.executeUpdate(
      "INSERT INTO user_list(id, name) VALUE(3, 'tktk')");
    con.commit();
  }

  ResultSet rs = stmt.executeQuery(
    "SELECT * FROM user_list WHERE id = 3");
  rs.next();

  System.out.println(rs.getString("name"));

} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}

