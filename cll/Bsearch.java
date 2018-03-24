//static int binarySearch(type[] a[, int fromIndex, int toIndex], type key)
//static <T> int binarySearch(T[] a[, int fromIndex, int toIndex ], T key, Comparator<? super T> c)

int[] ary = new int[10];
Random random = new Random();

for(int i = 0; i < ary.length; i++){
  ary[i] = random.nextInt(9) + 1;
}

Arrays.sort(ary);

Arrays.stream(ary).forEach(System.out::print);
System.out.println();

System.out.print(Arrays.binarySearch(ary, 5));

System.out.println(Arrays.binarySearch(ary, 5));

System.out.println(Arrays.binarySearch(ary, -1));

System.out.println(Arrays.binarySearch(ary, 10));

