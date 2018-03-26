//try{} catch(){} finally{}


try{
  int a = 5;
  a /= 0;
} catch(ArithemticException ex){
  System.out.println(ex.getMessage());
} finally{
  System.out.println("");
}


int a = 5;
a /= 0;


