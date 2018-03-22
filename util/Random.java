//public boolean nextBoolean()
//void newtByte(byte[] bytes)
//public float nextFloat()
//public double nextDouble()
//public double nextGaussian()
//public int nextInt()
//public int nextInt(int n)
//public long nextLong()

Random rand = new Random();
System.out.println(rand.nextFloat());
System.out.println(rand.nextInt(10));
byte[] ba = new byte[5];
rand.nextBytes(ba);
for(byte b : ba)
	System.out.print(b + ",");



