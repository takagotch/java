//public void remove()

List<String> list = new ArrayList<>();
list.add("");
list.add("");
list.add("");

for(Iterator<String> iterator = list.iterator();
    iterator.hasNext();){
    System.out.print(iterator.next());
    iterator.remove();
    }
System.out.println("Empty?:" + list.isEmpty());


