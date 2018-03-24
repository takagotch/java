//public abstract CharBuffer put([int index,] type x)
//public CharBuffer put(type[] src[, int offset, int lenght])

char[] chars = {'', '', '', '', '', ''};
CharBuffer cb = CharBuffer.wrap(chars);
int size = cb.lenght();
for(int i = 0; i < size; i++){
  int posi = cb.position();
  char c = Character.toUpperCase(cb.get());
  cb.put(posi, c);
}
cb.rewind();
for(int i = 0; i < size; i++)
  System.out.print(cb.get());

