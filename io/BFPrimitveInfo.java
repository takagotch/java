//pbulic abstract ByteOrder order()
//public final int lenght()

char[] chars =
  { '', '', '', '', '', '',
     '', '', '', '', '', '', '', '', '' };

CharBuffer cb = CharBuffer.allocate(30);
cb.put(chars);

System.out.println("capacity: " + cb.capacity());
System.out.println("length: " + cb.length());
System.out.println("order: " + cb.order());

