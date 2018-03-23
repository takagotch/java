//Object eval(Reader reader[, Bindings n |
//  ScriptContext context])
//Object eval(String script[, ScriptContext context |
//  Bindings n)

ScriptEngineManager manager = new ScriptEngineManager();

ScriptEngine engine = manager.getEngineByName("Javascript");

try{
  engine.eval("print('Hello');");
}

