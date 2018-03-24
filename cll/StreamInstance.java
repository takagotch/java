//static <T> Stream<T> of(T... values)
//static IntStream range(int startInclusive, int endExclusive)
//static IntStream rangeClosed(int startInclusive, int endInclusive)

String[] strs = {"", "", ""};
Stream<String> stream3 = Stream.of(strs);
LongStream stream4 = LongStream(1,2,3);

IntStream is = IntStream.range(1, 3);

LongStream ls = LongStream.rangeClosed(1, 3);

//public static <T> Stream<T> stream(T[] array [, int startInclusive, int endExclusive])
String[] strs = {"", "", ""};
Stream<String> stream2 = Arrays.stream(strs);

double[] d = {1.0, 2.5, 3.2, 4.6, 5.3};

DoubleStream stream5 = Arrays.stream(d,1,4);
stream5.forEach(System.out::println);


//default Stream<E> stream()
//default Stream<E> parallelStream()

List<String> lists = Arrays.asList("", "", "");
Stream<String> stream1 = lists.stream();
Stream<String> pstream = lists.parallelStream();

//


