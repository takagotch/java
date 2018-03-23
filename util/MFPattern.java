//public void applyPattern(String pattern)
//public String toPattern()

Object[] argment = { "Taka", "Tky" };
MessageFormat form =
  new MessageFormat("{0} {1} ");
System.out.println();
form.applyPattern("{1} {0} ");
System.out.println(form.format(argment));
