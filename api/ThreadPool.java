//<T> Future<T> submit(Callable<T> task)
//Future<?> submit(Runnable task)
//void shutdown()
//boolean awaitTermination(long timeout, TimeUnit unit)
//List<Runnable> shutdownNow()

public static void sample2(){
  ExecutorService exec = Executors.newFixedThreadPool(3);
  List<Future<Long>> list = new ArrayList<>();
  try{
    for(int i = 0; i < 10; i++){
      list.add(exec.submit(() -> {
        Thread.sleep(2000);
	return Thread.currentThread().getId();
      }));
    }

    for(Future<Long> future : list){
      try{
        System.out.println(future.get());
      } catch(Exception e){ e.printStackTrace(); }
    }
  } finally {
    exec.shutdown();
    try{
      exec.awaitTermination(5, TimeUnit.SECONDS);
    } catch(InterruptedException e){
      exec.shutdownNow();
    }
  }
}

public static void main(String[] args){
  sample2();
}

//static ExecutorService newSingleThreadExecutor()
//static ExecutorService newFixedThreadPool(int nThreads)
//static ExecutorService newCachedThreadPool()
//boolean inDone()

ExecutorService exec = Executors.newFixedThreadPool(3);

//v get([long timeout, TimeUnit unit])
//boolean isDone()

class MyCallable implements Callable<String>{
  @Override
  public String call() throws Exception {
    Thread.sleep(2000);
    return Thread.currentThread().getName();
  }
}

public class ThreadPoolSample {
  public static void sample1(){
    ExcutorService exec = Executors.newSingleThreadExecutor();

    Future<String> future = exec.submit(new MyCallable());
    try{
      System.out.println(future.isDone());

      System.out.println(future.get());

      System.out.println(future.isDone());
    } catch(InterruptedException | ExecutionException e){
      e.printStackTrace();
    } finally{
      exec.shutdown();
      try{
        exec.awaittermination(5, TimeUnit.SECONDS);
      } catch(InterruptedException e){
        exec.shutdownNow();
      }
    }
  }

  public static void main(String[] args){
    sample1();
  }
}


