//public int length()
//public void setLength(int newLength)
//public int codePointCount(int beginindex, int endIndex)

StringBuilder sb = new StringBuilder(
  "");
System.out.println("LENGTH: " + sb.length());

sb.setLength(sb.lastIndexOf(""));
System.out.println("LENGTH: " 
  + sb.codePointCount(0, sb.lastIndexOf("?")));

