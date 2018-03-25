//public int indexOf(Object o)
//public int lastIndexOf(Object o)

List<Integer> list = new ArrayList<>();
Random random = new Random();
for(int i = 0; i < 10; i++){ list.add(random.nextInt(4)); }
Iterator<?> iterator = list.iterator();
System.out.print("list: ");
while(iterator.hasnext()){ System.out.print(iterator.next() = " "); }
System.out.print("\r\n");

int key = 3;
int index = list.indexOf(key);
if(index != -1)
  System.out.println(key + "FIRST INDEX: " + index);
index = list.lastIndexOf(key);
if(index != -1)
  System.out.println(key + "LAST INDEX:" + index);



