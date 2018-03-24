//Optional<T> min(Comparator<? super T> comparator)
//Optional<T> max(Comparator<? super T> comparator)
//int sum() IntStream
//long sum()
//double sum() DoubleStream
//OptionalDouble average() Stream

dobule[] d = { 1.0, 2.5, 3.2, 4.6, 5.3 };
List<Double> r = new ArrayList<>();
r.add(Arrays.stream(d).sum());
r.add(Arrays.stream(d).average().getAsDouble());
r.add(Arrays.stream(d).min().getAsDouble());
r.add(Arrays.stream(d).max().getAsDouble());
System.out.println(r);


//long count()

doube[] d = { 1.0, 2.5, 3.2, 4.6, 5.3 };
System.out.println(Arrays.stream(d).count());

List<String> list = Arrays.asList("", "", "");

Predicate<String> predicate = s -> s.startsWith("A");

long n = list.stream().filter(predicate).count();
System.out.println(n);

//void forEach(Consumer<? super T> action)
int[] ary_num = {1, -2, 3 };
Arrays.stream(ary_num).sorted().forEach(System.out::println);

List <String> list_str = new ArrayList<>();
list_str.add("");
list_str.add("");
list_str.add("");

list_str.forEach(str -> System.out.println(str));

//<R> Stream<R> map(Function<? super T,?> extends R> mapper)
//IntStream mapToInt(ToIntFunction<? super T> mapper)
//LongStream mapToLong(ToLongFunction<? super T> mapper)
//DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)
//<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
//IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
//LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)
//DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)

int[] ary = {1, 2, 3};

Array.stream(ary).map(n -> n*2).forEach(System.out::println);

int[][] ary2 = {{1, 2, 3}, {4, 5}, {5, 6, 7, 8}};
Arrays.stream(ary2).flatMapInt(
	s -> { return Arrays.stream(s).map(n -> n*2);}
).forEach(Sytem.out::print);

System.out.println();

List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
System.out.println(num);

List<Integer> sqr = num.stream().
  map(n -> n*n).collect(Collectors.
	toList());
System.out.println(sqr);


//Stream<T> sorted([Comparator<? super T> comparator])

Stream<String> s1 = Stream.of("12", "abc", "AA");

s1.sorted().forEach(System.out::print);

Stream<String> s2 = Stream.of("12", "abc", "AA");

s2.sorted(Comparator.reverseOrder())
  .forEach(System.out::print);


//Stream<T> filter(Predicate<? super T> predicate)
List<String> lists = Arrays.asList("", "", "");
Stream<String> Stream1 = lists.stream();

stream1.filter(v -> v.indexOf(".") > 0)
	.forEach(System.out::println);

//static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
Stream<String> a = Stream.of("", "", "");
Stream<String> b = Stream.of("", "", "");

Stream.concat(a, b).forEach(System.out::println);



