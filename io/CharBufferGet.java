//public abstract type get([int index])
//public CharBuffer get(type[] dst[, int offset, int length])

char[] chars = {'', '', '', ''};
CharBuffer cb = CharBuffer.allocate(10);

cb.put(chars);

cb.rewind();
for(int i = 0; i < 4; i++)
  System.out.println(cb.get());


