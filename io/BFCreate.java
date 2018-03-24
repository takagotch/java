//public static CharBuffer alloacate(int capacity)
//public static CharBuffer wrap(type[] array[, int offset, int lenght])
//public abstract CharBuffer slice()
//public abstract CharBuffer duplicate()

CharBuffer cb = CharBuffer.wrap("This is sample CharBuffer.");
for(int i = 0; i < 8; i++){
  System.out.print(cb.get());
}
System.out.println9);
CharBuffer sub = cb.slice();
int n = sub.length();
for(int i = 0; i < n; i++){
  System.out.print(sub.get());
}
System.out.println();

