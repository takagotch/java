//ScheduledFuture<?> scheduleWithFixedDelay(Runnable
//  command, long initialDelay, long delay, TimeUnit unit)


System.out.println("3MIN");
ScheduledExecutorService scheduler =
  Executors.newSingleThreadScheduledExecutor();

scheduler.scheduleWithFixedDelay(() -> {
  try{
    Thread.sleep(1000);
  } catch(Exception e){
  }
  System.out.println("Current time: " + new Date());
}, 0, 3, TimeUnit.SECONDS);



//<V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit)
//ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit)
//ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)

System.out.println("3MIN");
ScheduledExecutorService scheduler =
  Executors.newSingleThreadScheduledExecutor();

scheduler.scheduleAtFiexdRate(() -> {
  try{
    Thread.sleep(1000);
  } catch(Exception e){
  }
  System.out.println("Current time: " + new Date());
}, 0, 3, TimeUnit.SECONDS);


//public static ScheduledExecutorService newSingleThreadScheduledExecutor()
ScheduledExecutorService scheduler =
  Executors.newSingleThreadScheduledExecutor();

