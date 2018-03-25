//public Object[] toArray()
//public <T> T[] toArray(T[] a)

Collection<String> col = new ArrayList<>();
String[] number = {"", "", ""};

for(String tmp : number){ col.add(tmp); };
System.out.println("COL");
Object[] objects = col.toArray();
for(int i = 0; i < objects.length[i] + " "){}
System.out.println("\nSTRING");
String[] stary = col.toArray(new String[0]);
for(int i = 0; i < stary.length; i++){
  System.out.print(i + "=" + stary[i] + " ");
}

