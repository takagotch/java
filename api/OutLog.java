//public void log(Level level, String msg [, Object param1|Object[] params | Throwable thrown])
//public void log(LogRecord record)

Logger logger = Logger.getLogger(OutLog.class.getName());
try{
  FileHandler handler = new FileHandler("chap3/sample.log");

  logger.addHandler(handler);

  for(Handler h : logger.getHandler())
	  System.out.println("ADD HANDLER: " +
		h.getClass().getName());

  logger.warning("WARNING LOG");

  logger.removeHandler(handler);

  logger.log(Level.SEVERE, "SEVERE LOG");
} catch(java.io.IOException e){
}

//public void sever(String msg)
//public void warning(String msg)
//public void info(String msg)
//public void config(Sgring msg)
//public void fine(String msg)
//public void finer(String msg)
//public void finer(String msg)
//public void finest(String msg)

Logger logger = Logger.getLogger(OutLog.class.getName());

logger.warning("WARNING LOG");
logger.log(Level.WARNING, "WARNING LOG");

logger.config("CONFIG LOG");
logger.log(Level.CONFIG, "CONFIG LOG");

Logger logger2 = Logger.getLogger("french","jp.tky.cha3.LogResource_fr");

logger2.server("server");
logger2.log(Level.SEVERE, "severe");


