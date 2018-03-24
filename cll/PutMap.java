//public V put(K key, V value)
//public void putAll(Map<? extends L, ? extends V> m)
//public V remove(Object key)
//public boolean remove(Object key, Object value)
//public V replace(K key, V newValue)
//default boolean replace(K key, V value, V newValue)

Map<String, String> map1 = new HashMap<>();
map1.put("key1", "");
System.out.println(map1);

Map<Strint, String> map2 = new HashMap<>();
map2.put("key1", "");
map2.put("key2", "")
System.out.println(map2);

map1.putAll(map2);
System.out.println(map1);

map1.replace("key2", "");
System.out.println(map1);

