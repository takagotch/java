//public boolean hasNext()

List<String> list = new ArrayList<>();
list.add("");
list.add("");

for(Iterator<String> iterator = list.iterator();
   iterator.hasNext();){
   System.out.println(iterator.next());
}


