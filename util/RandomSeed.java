//public void setSeed(long seed)


public static void printnum(Random r){
  bytes[] ba = new byte[5];
  r.nextBytes(ba);
  for(byte b : ba){
    System.out.print(b + " ");
  }
  System.out.println();
}

public static void main(String s[]){
  printnum(new Random());

  Random r = new Random(10);
  printnum(r);
  r.setSeed(10);
  printnum(r);
}


