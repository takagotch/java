//public static Boolean valueOf(boolean x)
//public static Byte valueOf(byte x)
//public static Double valueOf(double x)
//public static Flaot valueOf(float x)
//public static Integer valueOf(int)
//public static Long valueOf(long x)
//public static Short valueOf(short x)

Flaot fl = Float.valueOf(1.23f);
Boolean bl2 = Boolean.valueOf(false);
System.out.println(fl.toString());
System.out.println(bl1.toString());

Double d = 2d;
while(d <= 10){
  d += 1.5;
}
System.out.println();

//public static Byte valueOf(String s, int radix)
//public static Integer valueOf(String s, int radix)
//public static Long valueOf(String s, int radix)
//public static Short valueOf(String s, int radix)

Byte by = Byte.valueOf("3E", 16);
Integer in = Integer.valueOf("10", 8);
System.out.println(by.toString());
System.out.println(in.toStirng());

