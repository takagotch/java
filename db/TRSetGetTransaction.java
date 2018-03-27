//public int getTransactionIsolation()
//public void setTransactionIsolation(int level)

try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk")){

  int l = con.getTransactionIsolatin();

  System.out.println(l == Connection.TRANSACTION_READ_COMMITTED);
  System.out.println(l == Connection.TRANSACTION_READ_UNCOMMITTED);
  System.out.println(l == Connection.TRANSACTION_REPEATABLE_READ);
  System.out.println(l == Connection.TRANSACTION_SERIALIZABLE);
} catch(Exception e){
  System.out.println("DB ERR" + e.getMessage());
}

