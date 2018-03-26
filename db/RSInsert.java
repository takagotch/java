//public void insertRow()
//public void moveToInsertRow()
//public void moveToCurrentRow()

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhostL3306/tky_db", "tky", "tk");
  Statement st = con.createStatement(
    ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
    
  ResultSet rs = st.executeQuery(
    "SELECT id, name FROM user_list ORDER BY id");
  rs.moveToInsertRow();
  rs.insertInt(1, 10); rs.updateString(2, "takagotch");
  rs.insertRow();
  rs.moveToCurrentRow();
  rs.next();
  System.out.println(rs.getString("id"));
}


