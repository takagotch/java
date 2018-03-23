//public DecimalFormat()
//public DecimalFormat(String pattern)
//public void applyPattern(String pattern)
//public void applyLocalizedPattern(String pattern)
//public String toPattern()

DecimalFormat df = new DecimalFormat("#.#");
double a = 1.5D;
System.out.println(df.format(a));
df.applyPattern("000.00");
System.out.println(df.format(a));
a = 10000000D;
df.applyLocalizedPattern("\u000A4, ###");
System.out.println(df.format(a));


