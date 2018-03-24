//boolean anyMatch(Predicate<? super T> predicate)
//boolean allMatch(Predicate<? super T> predicate)
//boolean noneMatch(Predicate<? super T> predicate)

List<String> lists = Arrays.asList("gFn", "aLsdb", "adgd");

System.out.println(
  lists.stream().anyMathch(
	  s -> { return s.equals(s.toLowerCase()); }));

System.out.println(
	list.stream().allMatch(
		s -> { return s.equals(s.toLowerCase()); }));

System.out.println(
	list.stream().noneMatch(
		s -> { return 7 <= s.length(); }
	)
);


