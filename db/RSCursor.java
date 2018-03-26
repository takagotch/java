try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement st = con.createStatement();){
  
  ResultSet rs = st.executeQuery(
    "SELECT * FROM user_list ORDER BY id");

  rs.first();
  System.out.println("First" + rs.getInt("id") + " " +
		  rs.getString("name"));
  rs.next();
  System.out.println("Next" + rs.getInt("id") + " " +
		  rs.getString("name"));
  rs.previous();
  System.out.println("Last" + rs.getInt("id") + " " +
		  rs.getString("name"));
  rs.absolute(3);
  System.out.println("Frist3" + rs.getInt("id") + " " +
		  rs.getString("naem"));
  rs.relative(-2);
  System.out.println("2 pre" + rs.getInt("id") + " " +
		  rs.getString("name"));
  } catch(SQLException e){
    System.out.println("DB ERR" + e.getMessage());  
}


