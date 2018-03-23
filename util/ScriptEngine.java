ScriptEngineManager = new ScriptEngineManager();

for(ScriptengineFactory f : manager.getEngineFactories()){
  System.out.println(f.getLanguageName() + " " +
	f.getLanguageVersion());
  System.out.print(f.getName());
}

