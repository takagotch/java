//public static Properties getProperties()
//public static String getProperty(String key
//  [, String def])


TreeMap<?, ?> map =
  new TreeMap<Object, Object>(System.getProperties());

for(Object key : map.ketSet()){
  String val = System.getProperty((String)key);
  System.out.println(key + "=" + val);
}

