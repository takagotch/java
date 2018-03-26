//try{} catch (){} [finally {}]

public static class Exception1 extends Exception {
}

public static class Exception2 extends Exception {
}

public static void main(String[] arg){
  int n = 2;
  try{
    int n = 2;
    try{
      switch(n){
        case 1:
		throw new Exception1();
	case 2:
		throw new Exception2();
      }
    }
  } catch(Exception1 | Exception2 e){
    System.out.println(e instatnceod Exceptoin2);
  }
}

