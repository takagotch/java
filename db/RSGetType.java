//public int getType()
//public int getConcurrency()

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement st = con.createStatement(
    ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);){

  ResultSet rs = st.executeQuery("SELECT * FROM user_list");
  for(Field f : ResultSet.class.getFields()){
    if(f.getInt(f) == rs.getType() |
      f.getInt(f) == rs.getConcurrency()){
      System.out.println(f.getName());
      }
  }
}

