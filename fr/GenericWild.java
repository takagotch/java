//class<?>

GenericClass<Number> gc_number = new GenericClass<Number>();
GenericClass<? super Integer> gc1;
gc1 = gc_number;
gc1.setValue(123);
//gc1.setBalue("123");

GenericsClass<? extends Number> gc2 = new GenericClass<>();

GenericClass<Integer> gc3 = new GenericClass<>();
gc3.setValue(123);
gc2 = gc3;

System.out.println(gc2.getValue().intValue());


