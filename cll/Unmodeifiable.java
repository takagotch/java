//public static <T> Collection<T> unmodifiableCollection( Collection<? extends T> c)
//public static <T> Set<T> unmodifiableSet( Set<? extends T> s)
//public static <T> SortedSet<T> unmodifiableSortedSet( SortedSet<T> ss)
//public static <T> List<T> unmodifialbeList( List<? extends T> list)
//public static <K, V> Map<K, V> unmodifialbeMap( Map<? extends K, ? extends V> m)
//public static <K, V> SortedMap<K, V> unmodifiableSortedMap( SortedMap<K, ? extends V> sm)

List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
System.out.println(list);

List<Integer> unmodifiable = Collecttions.unmodifiableList(list);
try{
  unmodifiable.add(1);
} catch(Exception e){
  e.printStackTrace();
}


