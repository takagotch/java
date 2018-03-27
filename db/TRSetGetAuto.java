//public boolean getAutoCommit()
//public void setAutoCommit(boolean autoCommit)

if(con.getAutoCommit()){
  con.setAutoCommit(false);
  System.out.println("AUTO COMMIT OFF");
}

