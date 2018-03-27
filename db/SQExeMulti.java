//public boolean execute(String sql)
//public ResultSet getResultSet()
//boolean getMereResults([int current])

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement stmt = con.createStatement();){
  
  stat.executeUpdate("CREATE or REPLACE PROCEDURE Multi() " +
   		     "begin SELECT * FROM user_list; " +
		     "SELECT count(*) FROM user_list; end;");

  boolean bl = stmt.execute("call Multi()");
  if(bl){
    ResultSet rs = stmt.getResultSet();

    if(stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT)){
      System.out.println("FIRST LAST SET");
      while(rs.next()){
        System.out.println(rs.getInt("ID") + " " +
	  rs.getString("NAME"));
      }
      System.out.println("NEXT SET");
      ResultSet rs2 = stmt.getResult();
      while(rs2.next()){
        System.out.println(rs2.getInt(1));
      }
    }
    System.out.println("NEXT RESULT: " 
      + stmt.getMoreResults());
  }
} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());  
}

