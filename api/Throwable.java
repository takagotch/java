//public String getMessage()
//public String toStirng()

int[] intArray = new int[3];

try{
  for(int i = 0; i < 4; i++){
    intArray[i] = i * 2;
  }
} catch(ArrayIndexOutOfBoundsException e){
  System.out.println(e.getMessage());

  System.out.println(e.toStirng());
}



