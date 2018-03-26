static class MultiValue {
  int v;
  MultiValue(String _v){
    this.v = Integer.parseInt(_v)*2;
  }
  @Override
  public String toString(){
    return String.valueOf(this.v);
  }
}

public static void main(String[] args){
  List<String> list = Arrays.asList("", "", "");

  Stream<MultiValue> m =
	  list.stream().map(MultiValue::new);

  m.forEach(System.out::println);
}


