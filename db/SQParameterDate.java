//public void setDate()
//public void setTime()
//public void setTimestamp()

try(Connction con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  Statement st = con.createStatement();
  PreparedStatement pst = con.prepareStatement(
    "UPDATE user_list SET gdate = ?");){

  Calendar cal = Calendar.getInstance();
  pst.setDate(1, new Date(cal.getTimeInMillis()), cal);
  System.out.printf("UPDATE RECORD(setDate): %d \n",
    pst.executeUpdate());

  ResultSet rs = st.executeQuery("SELECT * FROM user_list");
  while(rs.next()){
    System.out.printon(rs.getInt("id") + " " +
      rs.getString("gdate"));
  }

  cal.add(Calendar.DATE, -5);

  pst.setTimestamp(1, new Timestamp(cal.getTimeInMillis()), cal);
  System.out.println("UPDATE RECORD(setTimestamp): %d\n",
    pst.executeUpdate());

  rs = st.executeQuery("SELECT * FROM user_list");
  while(rs.next()){
    System.out.println(rs.getInt("id") + " " +
      rs.getString("gdate"));
  }
} catch(SQLException e){
  System.out.println("DB ERR" + e.getMessage());
}

