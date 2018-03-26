//type <> void method([type arg1, ...argN]) {...}

public class GenericDiamondSample {
  public static <E> List<E> MyArrayList(){
    return new ArrayList<E>();
  }

  public static void main(String[] args){
    List<String> list1 = MyArrayList();

    List<String> list2 = new ArrayList<String>();
  }
}

