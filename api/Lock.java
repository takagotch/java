//void lock()
//void lock()
//boolean tryLock([long timeout, TimeUnit unit])

public static class Test {
  int count = 0;
  public void something(){
    count++;
    System.out.print(count);
  }
}

public static void with_lock(){
  Lock lock = new ReentrantLock();

  Test test = new Test();

  ExecutorService exec = Executors.newFixedThreadPool(3);
  try{
    for(int i = 0; i < 10; i++){
      exec.submit(
	  () -> { try {
	              lock.lock();
	              test.something();
	              lock.unlock();
	  } catch(Exception e){ }
	  });
    }
  } finally {
    exec.shutdown();
    try{
      exec.awaitTermination(5, TimeUnit.SECONDS);
    } catch(InterruptedException e){
    }
  }
}

public static void main(String[] args){
  with_lock();
}

