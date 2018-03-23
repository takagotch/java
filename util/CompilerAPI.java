//public static JavaCompiler getSystemJavaCompiler()

public void CompilerTest(){
  JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
  if(compiler == null){
    System.out.println("NOT SUPPORT");
    return;
  }
  System.out.println(compiler.getSourceVersions());
}

public static void main(String[] args){
  new CompilerAPI().CompilerTest();
}


