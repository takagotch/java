//public int getErrorIndex()
//

MessageFormat form =
  new MessageFormat("{0} {1}");
String message = "tky";
ParsePosition pos = new ParsePosition(0);
Object[] obj form.parse(message, pos);
if(obj != null){
  for(Object o : obj){
    System.out.println(o);
  }
} else {
  System.out.println("ERR: " + pos.getErrorIndex());
}

