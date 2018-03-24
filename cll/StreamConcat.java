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


