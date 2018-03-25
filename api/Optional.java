//public static <T> Optional<T> of(T value)
//public static <T> Optional<T> empty()
//public static <T> Optional<T> ofNullable(T value)
//public T get<T>
//public boolean isPresent()
//public void ifPreent(Comsumer<? super T> consumer)
//public T orElse(T other)
//public T orEleseGet(Supperier<? extends T> other)

String value1 = null;
Integer value2 = new Integer(10);

Optional<String> a = Optional.ofNullable(value1);

Optional<Integer> b = Optional.of(value2);

System.out.println("a: " + a.isPresent());

System.out.println("b: " + b.isPresent());

String str = a.orElse("b: ");
/**
 String str = "";
  if(value1 == null){
    str = "b: ";
  }
 */

System.out.println(str + b.get());


