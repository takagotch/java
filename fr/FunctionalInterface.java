//[@FunctionalInterface]
//interface { ([type arg1, ...argN] ); }

public class FunctionalInterfaceSample {
  @FunctionalInterface
  interface BMI{
    double calc(double w, double h);
  }

  public static void main(String[] args){
    BMI bmi = (w, h) -> { return w / (h * h); };

    DoubleBinaryOperator d = (w, h) -> { return w / (h * h); };

    System.out.println("BMI= " + bmi.calc(78d, 1.7d));
    System.out.println("BMI= " + d.applyAsDouble(78d, 1.7d));
  }
}
