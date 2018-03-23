//int run(InputStream in, OutputStream out,
//  OutputStream err, String ... arguments)

JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
if(compiler != null){
  File f = new File("src/jp/tky/page/chap8/CompilerAPI.java");
  File b = new File("bin");
  String[] arg2 = {"-d", b.getAbsolutePath(),
    f.getAbsolutePath() };
  compiler.run(null, null, null, args2);
  Class<?> test =
	  Class.forName("jp.tky.page.chap8.CompilerAPI");
  for(Method m : test.getMethods()){
    System.out.println(m.getName);
  }
}


