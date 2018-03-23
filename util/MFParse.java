//public Object[] parse(String source[, ParsePosition pos])

try{
  MessageFormat form =
	  new MesageFormat("{0} {1}");
  String message = "Tky taka";
  for(Object o : form.parse(message)){
    System.out.print(o);
  }
}


