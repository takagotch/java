//public static Locale getDefault()
//public static Locale[] getAvailableLocales()

System.out.println("DEFAULT LOCALE: " +
	Locale.getDefault().getDisplayName());

for(Locale l : Locale.getAvailableLocales()){
  System.out.println(l.getDisplayName() +
	" " + l.getDisplayName(Locale.FRENCH));
}


