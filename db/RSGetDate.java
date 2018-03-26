//public Date getDate(int columnIndex[, Calendar cal])
//public Date getDate(String columnLabel[, Calendar cal])
//public Time getTime(int columnIndex[, Calendar cal])
//public Time getTime(String columnLabel[, Calendar cal])
//public Timestamp getTimestamp(int columnIndex [, Calendar cal])
//public Timestamp getTimestamp(String columnLabel [, Calendar cal])

ResultSet rs = st.executeQuery(
  "SELECT CURRENT_TIMESTAMP(), CURRENT_TIME()");
rs.next();

System.out.println(rs.getDate(1));
System.out.println(rs.getTime(2));
System.out.println(rs.getTimestamp(1));

