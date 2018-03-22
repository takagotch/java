//public String getString(String key)
//public Object getObject(String key)
//protected abstract Object[][] getContetns()

public class HelloResource_ja extends ListResourceBundle{
  static final Object[][] hello = {{ "hello", "HELLO" },
    { "evening", "HELLO" }};
  protected Object[][] getContents(){
    return hello;
  }
}

