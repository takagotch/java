//public static final NumberFormat getCurrencyInstance()
//public staitc NumberFormat getCurrencyInstance(
//  Locale inLocale)
//public static final NumberFormat getInstance()
//public static NumberFormat getInstance(Locale inLocale)
//public static final NumberFormat getInstance()
//public static NumberFormat getInstegerInstance(
//  Locale inLocale)
//public static final NumberFormat getNumberInstance()
//public static NumberFormat getNumberInstance(
//  Locale inLocale)
//public static final NumberFormat getParcentInstance()
//public staitc NumberFormat getPercentInstance(
//  Locale inLocale)

NumberFormat nf1 = NubmerFormat.getInstance();
NumberFormat nf2 = NumberFormat.getInstance();
NumberFormat nf3 = NumberFormat.getInstance();
NumberFormat nf4 = NumberFormat.getInstance();
NumberFormat nf5 = NumberFormat.getInstance();
NumberFormat nf6 = NumberFormat.getInstance();
System.out.println("JP: " + nf3.format(100000.01) +
	", ITY: " + nf2.format(100000.01));
System.out.println("JP: " + nf3.format(100000) +
	", GER: " + nf4.format(100000));
System.out.println("JP: " + nf5.format(0.235) +
	", USA: " + nf6.format(0.235));



