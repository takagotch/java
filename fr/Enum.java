//enum {}

enum Signal {
  RED, BLUE, YELLOW;
  @Override
  public String toString() { return "" + name(); }
}
public static void main(String[] args){
  Signal s = Signal.RED;
  if(s != Signal.BLUE) System.out.println("WARNING");
  switch(s){
    case RED:
    case YELLOW:
	    System.out.println("STOP");
	    break;
    default:
	    break;
  }
  System.out.print(s.toString());
}


