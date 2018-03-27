//public void setNull(int index, int sqlType [, String typeName])

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_do", "tky", "tk");
  Statement st = con.createStatement();
  PreparedStatement pst = con.prepareStatement(

    "INSERT INTO user_list ( id, name ) VALUES (" +
    "(SELECT max_id + 1 FROM (" +
    " SELECT MAX(id) AS max_id FROM user_list ) AS t ),?)");){
    
  pst.setNull(1, java.sql.Types.VARCHAR);
  System.out.println("ADD RECORD: %d\n", pst.executeUpdate());
} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}


