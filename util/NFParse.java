//public Number parse(String source)

try{
  NumberFormat nf = NumberFormat.getInstance();
  System.out.println(nf.parse("100.8"));
} catch(ParseException e){
  e.printStackTrace();
}


