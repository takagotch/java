//static type[] copyOf(type[] original, int newLength)
//static <> T[] copyOf(T[] original, int newLength)
//static <T, U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType)

String[] org = {"", "", "", ""};

String[] ary1 = Arrays.copyOf(org, 2);
System.out.println(Arrays.toStirng(ary1));

String[] ary2 = Arrays.copyOf(org, 5, String[].class);
System.out.println(Arrays.toString(ary2));

