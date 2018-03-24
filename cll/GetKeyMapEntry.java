//public Object getKey()
//public Object getValue()
//public Object setValue(Object value)

Map<String, String> map = new HashMap<>();
map.put("key1", "");
map.put("key2", "");
map.put("key3", "");
Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
while(uterator.hasNext()){
  Map.Entry<String, String> mapEntry = iterator.next();

  mapEntry.setValue(mapEntry.getValue() + mapEntry.getKey());
}
System.out.println("setValue: " + map);

