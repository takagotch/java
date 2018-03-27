//

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tiger");
  PreparedStatement pst = con.prepareStatemnet(
    "SELECT * FROM user_list WHERE (id < ?) AND (name LIKE ?)");){

  pst.setInt();
  pst.setString(2, "R%");

  ResultSet rs = pst.executeQuery();

  while(rs.next()){
    System.out.println(rs.getInt("id") + " " +
      rs.getString("name"));
  }
} catch(SQLException e){
  System.out.println("DB ERR" + e.getMesssage());
}

