//class {
// - -;
// - -(){ }
//}

class GenericClass<T>{
  T value;

  public void setValue(T val){
    T value2 = val;
    this.value = value2;
  }

  public T getValue(){
    return this.value;
  }

  //public static void getValue(T val){}
  //static T value2;

  public class GenericSample {
    public static void main(String[] args){
      GenericClass<Integer> gc1 = new GenericClass<Integer>();
      gc1.setValue(123);
      System.out.println(gc1.getValue());

      GenericClass<String> gc2 = new GenericClass<String>();
      gc2.setValue("str");
      System.out.println(gc2.getValue());

      //gc2.setValue(123);
    }
  }
}

List<Float> flist = new ArrayList<Float>();
List<Double> dlist = flist;

