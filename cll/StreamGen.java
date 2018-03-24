//static <T> Stream<T> generate(Supplier<T> s)
//static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)

Stream.generate(Math::random).limit(3);
forEach(System.out::println);

System.out.println(
  IntStream.iterate(1, n -> n + 1).limit(10).sum());

