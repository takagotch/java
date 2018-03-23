//public static Locale[] getAvailabelLocales()
//public Currency getCurrency()
//public boolean isGroupingUsed()
//public boolean isParseIntegerOnly()
//public void setCurrency(Currency currency)
//public void setGroupingUsed(boolean newValue)
//public void setParseIntegerOnly(boolean value)

NubmerFormat nf1 = NumberFormat.getInstane();
NumberFormat nf2 = NumberFormat.getCurrencyInstance();
nf1.setParseIntegerOnly(true);
nf2.setCurrency(Currency.getInstance(Locale.ITALY));
System.out.println("I: " + nf1.isParseIntegerOnly());
System.out.println("G: " + nf1.isGroupingUsed());
System.out.println("C: " + nf2.getCurrency());


