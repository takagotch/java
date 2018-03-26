//@interface 

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Debug {}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@interface Version { double value(); }

@Repeatable(ValueAnnotation.class)
@interface StringAnnotation { String value(); }

@interface ValueAnnotation {
  StringAnnotation[] value();
}

@StringAnnotation(value = "str1")
@StringAnnotation(value = "str2")
@Version(0.1)
public class AnnotationSample2 {
  @Debug
  public void disp(){
  }
  public static void main(String[] args) throws SecurityException,
	 NoSuchMethodException {
	
	 Version v = AnnotationSample2.class.getAnnotation
		 (Version.class);

	 System.out.println(v.value());

	 Debug d = AnnotationSample2.class.getMethod("disp").
		 getAnnotation(Debug.class);
	 if(d != null){
	   System.out.println("debug.");
	 }
  }
}

// @Override, @Deprecated, @SuppressWarnings, @FunctionalInterface

class FigureSample
{
  float getArea(float a, float b) { return 0.0f; }
}

class SquareSample extends FigureSample
{
  @Deprecated
  public int sample() { return 0; }

  //@Override
  double getArea(double a, double b){
    return a * b;
  }
}

@SuppressWarning("unused")
public class AnnotationSample1 {
  public static void main(String[] args){
    int x;
    SquareSample obj = new SquareSample();
    obj.sample();
  }
}

