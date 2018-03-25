//public final int addAndGet(int delta)
//public final int getAndAdd(int delta)
//public final boolean compareAndSet(int expect, int update)
//public final int getAndIncrement()
//public final int getAndDecrement()
//public final int get()
//public final int set(int newValue)

class AtomicAdd{
  AtomicInteger count = new AtomicInteger();

  public void add() { count.addAndGet(3); }
  public int get() { return count.get(); }
}
AtomicAdd sample = new AtomicAdd();

ExecutorServer exec = Executors.newFixedThreadPool(100);
for(int i = 0; i < 1000; i++){
  exec.submit(() -> { sample.add(); });
}

exec.shutdown();
try{
  exec.awaitTermination(5, TimeUnit.SECONDS);
} catch(InterruptedException e){
  exec.shutdownNow();
}

System.out.println(sample.get());

