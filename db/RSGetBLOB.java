//public type getXxx(int columnIndex | String columnLabel)



try(Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tky_db", "tky", "tk");
  PreparedStatement ps1 = con.prepareStatement(
    "REPLACE INTO picture_list(id,contents) VALUES(1, ?)");
  PreparedStatement ps2 = con.prepareStatement(
    "SELECT contents FROM picture_list WHERE id=?");){
    
  File fin = new File("chap7/sky.jpg");
  try(FileInputStream in = new FileInputStream(fin)){
  
    ps1.setBinaryStream(1, in,fin.length());
    ps1.executeUpdate();

    ps2.setInt(1, 1);
    ResultSet rs = ps2.executeQuery();
    rs.next();

    BufferedImage img = ImageIO.read( rs.getBinaryStream(1) );
    Icon icon = new ImageIcon(img);

    JOptoinPane.showMessageDialog(null, "", "",
      JOptionPane.PLAIN_MESSAGE, icon );
  } catch(IOException e){
  }
} catch(SQLExceptoin e){
  System.out.println("DB ERR" + e.getMessage());
}

