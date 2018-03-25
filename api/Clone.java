//protected Object clone()

public class CloneSample implements Cloneable {
  StringBuilder str = new StringBuilder();

  public static void main(String[] args) throws
    CloneNotSupportedException {
    int[] org = {1, 2};
    int[] cloned = org.clone();

    System.out.println("cloned: " + cloned[0] + cloned[1]);

    CloneSample obj = new CloneSample();

    obj.str.append("Original");

    CloneSample shallow = (CloneSample).obj.clone();

    CloneSample deep = new CloneSample();
    deep.str.append(obj.str.toString());

    obj.str.reverse();

    System.out.println("shallow: " + shallow.str.toString());

    System.out.println("deep: " + deep.str.toString());
    }
}


