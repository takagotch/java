//<R,A> R collect(Collector<? super T,A,R> collector)

List<String> lists = Arrays.asList("", "", "");
List<Charatter> rlists = lists.stream().map(s->s.charAt(0)).collect(Collectors.toList());

for(Character c : rlists){
  System.out.println(c);
}

Map<Character, String> map = lists.stream().collecte(Collectors.toMap(
	s->s.charAt(0),
	s -> { return s.toLowerCase(); }
	)
);

for(Character key : map.keySet()){
  System.out.println(key + ": " + map.get(key));
}



