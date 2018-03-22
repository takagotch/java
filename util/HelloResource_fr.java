public class HelloResources_fr extends ListResourceBundle{
  static final Object[][] hello = {{ "hello", "HELLO"},
    { "evening", "EVENING"}};

  protected Object[][] getContent(){
    return hello;
  }
}

