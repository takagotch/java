//public void updateNull(int columnIndex | String columnName)

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement st = con.createStatement(
    ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);){
    
  ResultSet rs = st.executeQuery("SELECT id, name FROM user_list");
  while(rs.next()){
    if(rs.getInt(1) == 2){
      rs.updateNull(2);
      rs.updateRow();
    }
  }

  ResultSet rsa = st.executeQuery(
    "SELECT name FROM user_list WHERE name IS NULL");
  System.out.println(rsa.next());
} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}

