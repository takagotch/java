//public void deleteRow()

try(Connection con =DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement st = con.createStatement(
    ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);){
    
  ResultSet rs = st.executeQuery(
    "SELECT id, name FROM user_list ORDER BY id");

  rs.last();
  rs.deleteRow();

  rs.beforeFrist();

  while (rs.next()){
    System.out.println(rs.getInt("id") + " " +
      rs.getString("name"))
  }
} catch(SQLException e){
  System.out.println("DB" + e.getMessage());
}


