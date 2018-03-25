//public final String getName()
//public final void setName(String name)
//public final int getPriority()
//public final void setPriority([int newPriority])

public static void main(String[] args){
  Thread th = new THSetGetInfoSample("My Thread");

  th.setPriority(MAX_PRIORITY);
  th.start();
}

public THSetGetInfoSample(String name){
  super(name);
}

public void run(){
  System.out.println(getName());

  Thread.currentThread().setName("YourThread");
  System.out.println(getName());

  System.out.println(getPriotity());
}

