//public void addBatch(String sql)
//public int[] executeBatch()


try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement stmt = con.createStatement();){

  stmt.addBatch(
    "INSERT INTO user_list(id, name) VALUES (5, 'tktk')");
  stmt.addBatch(
    "UPDATE user_list SET name='tktk' WHERE id =5");

  int[] ret = stmt.executeBatch();
  for(int i : ret){
    System.out.printf("RESULT: %d\n", i);
  }

  System.out.println("\nEXECUTE AFTER");
  ResultSet after = stmt.executeQuery(
    "SELECT * FROM user_list ORDER BY id");
  while(after.next()){
    System.out.println("%s %s%n", after.getString("id"),
      after.getString("naem").toString());
  }
}catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}


