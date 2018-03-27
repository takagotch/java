//public int getMaxFieldSize()
//public int getMaxRows()
//public void setMaxFieldSize(int max)
//public void setMaxRows(int max)

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement stmt = con.createStatement();){
 
  System.out.println("MAX: " + stmt.getMaxRows());
  System.out.println("BYTE: " + stmt.getMaxFieldSize());

  stmt.execute("SELECT * FROM user_list");
  ResultSet rs = stmt.getResult();
  while(rs.next()){
    System.out.println(rs.getInt("id") + " " +
      rs.getString("name"));
  }
  System.out.println();

  stmt.setMaxRows(2);
  stmt.setMaxFieldSize(5);
  System.out.println("MAX: " + stmt.getMaxRows());
  System.out.println("BYTE: " + stmt.getMaxFieldSize());
  stmt.execute("SELECT * FROM user_list");

  ResultSet rs2 = stmt.getResultSet();
  while(rs2.next()){
    System.out.println(rs2.getInt("id") + " " +
      rs2.getString("name"));
  }
} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}

