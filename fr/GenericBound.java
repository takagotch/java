//<T extends ->
//<T super ->

class NumberExtends<T extends Number>{
  T value;
  public void setValue(T val){
    this.value = val;
  }
  public int intValue(){
    return this.value.intValue();
  }
}

public class GenericBoundSample {
  public static void main(String[] args){
    NumberExtends<Float> f = new NumberExtends<float>();
    f.setValue(1.23F);
    System.out.println(f.intValue());
    //NuverExtends<String> s = new NumberExtends<String>();
  }
}

