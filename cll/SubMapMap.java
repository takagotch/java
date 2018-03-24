//public SortedMap headMap(Object toKey)
//public SortedMap subMap(Object fromKey, Object toKey)
//public SortedMap tailMap(Object fromKey)

SortedMap<String, String> map = new TreeMap<>();
map.put("key1", "");
map.put("key2", "");
map.put("key3", "");
map.put("key4", "");
map.put("key5", "");

System.out.println("All:" + map);

System.out.println("sub: " + map.subMap("key2", "key5"));

System.out.println("head: " +map.headMap("key3"));

System.out.println("tail: " + map.tailMap("key3"));

(map.headMap("key3")).remove(map.firstKey());

System.out.println("All: " + map);



