//static type[] copyOfRange(type[] original, int from, int to)
//static <T> T[] copyOfRange(T[] original, int from, int to)
//static <T> T[] copyOfRange(U[] original, int from, int to, Class<? extends []> newType)

String[] org = {"", "", "", ""};

String[] ary1 = Arrays.copyOf(org, 2);
System.out.println(Arrays.toString(ary1));

String[] ary2 = Arrays.copyOfRange(org, 1, 3);
System.out.println(Arrays.toString(ary2));

