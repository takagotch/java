//public int getMaximumIntegerDigits()
//public int getMinimumIntegerDigits()
//public int getMaximumFractionDigits()
//public int getMinimymFractionDigits()
//public void setMaximumIntegerDigits(int newValue)
//public void setMinimumIntegerDigits(int newValue)
//public void setMaximumFractionDigits(int newValue)
//public void setMaximymFractionDigits(int newValue)

NumberFormat nf = NumberFormat.getInstance();
nf.setMinimumFractionDigits(2);
System.out.println("少なくとも小数点以下"
	nf.getMinimumFractionDigits() + "位:" + nf.format(100));


