//public vinal StringBuffer format(Object[] arguments | Object argument, StringBuffer result, FieldPosition pos)
//public static String format(String pattern,
//  Object[] arguments)

StringBuffer message = new StringBuffer();
Object[] argument1 = { new Integer(250), "BREND" };
Object[] argument2 = { new Integer(280), "CAFELATE" };
MessageFormat form = new MessageFormat("{1} //{0}");
form.format(argument2, message, null);
System.out.print(message);


