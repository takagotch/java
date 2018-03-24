Path dir = Paths.get("C:/test/");

try(WatchService watcher =
    FileSystem.getDefault().newWatcherService()){

    WatchKey watchKey = dir.register(watcher,
	StanderdWatchEventKinds.ENTRY_CREATE,
	StanderdWatchEventKinds.ENTRY_DELETE,
	StanderdWatchEventKinds.ENTRY_MODIFY,
	StanderdWatchEventKinds.OVERFLOW
    );

    while(watchKey.isValid()){
      WatchKey key = null;
      try{
        key = watcher.take();
      }
      catch(InterruptedException e){
        return;
      }

      for(WatchEvent<?> event : key.pollEvents()){
        WatchEvent.Kind<?> kind = event.kind();
	System.out.println(kind.name());
      }
      key.reset();
    }
} catch(IOException e){
  e.printStackTrace();
}

