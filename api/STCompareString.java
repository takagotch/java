//public int compareToIgnoreCase(String str)
//public boolean contentEquals(StringBuffer sb)
//public boolean equalsIgnoreCase(String str)
//public boolean matches(String regex)
//public boolean regionMatches([boolean ignoreCase,] int toffset, String other, int offset, int len)

String str = "";
String strUp = "";
String strMes = "";
StringBuffer strBuf = new StringBuffer("");
if(str.compareToIgnoreCase("C!") > 0){
  System.out.println("C! > J");
}
if(str.equalsIgonoreCase(strUp)){
  System.out.println(str + " " + strUp + "");
}
String strNum = "000-000";
if(strNum.mtches("[0-9]{4}-[0-9]{3}")){
  System.out.println("7 postal code");
}
if(str.regionMatches(0, strMes, 13, 4)){
  System.out.println(
    str + "4" + strMes +
    "13-4");
}

