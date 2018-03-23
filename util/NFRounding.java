//public RoundingMode getRoundingMode()
//public void setRoundingMode(RoundingMode roundingMode)

DecimalFormat df = new DecimalFormat("#");

double a = 1.5D;
df.setRoundingMode(RoundingMode.UP);
System.out.println(df.format(a));

df.setRoundingMode(RoundingMode.DOWN);
System.out.println(df.format(a));

df.setRoundingMode(RoundingMode.CEILING);
System.out.println(df.format(a));

df.setRoundingMode(RoundingMode.FLOOR);
System.out.println(df.format(a));

df.setRoundingMode(RoundingMode.HALF_UP);
System.out.println(df.format(a));

df.setRoundingMode(RoundingMode.HALF_DOWN);
System.out.println(df.format(a));

df.setRoundingMode(RoundingMode.HALF_EVEN);
System.out.println(df.format(a));

try {
  df.setRoundingMode(RoundingMode.UNNECESSARY);
  System.out.println(df.format(a));
} catch(ArithmeticException e){
  System.out.println("ROUNDING");
}

