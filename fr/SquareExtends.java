//super([type arg1, ...argN]);

class Square3 extends Square2
{
  Square3(float width, float height){
    super(width, height);
  }

  @Override
  public float getArea(){
    return this.width * this.height /2;
  }
}

class SquareExtends {
  public static void main(String args[]){
    Square3 sqar = new Square3(2, 3);
    System.out.println("SQUARE: " + sqar.getArea());
  }
}

//class extends {}
class Square3 extends Square2
{
  Square3(float width, float height){
    super(width, height);
  }
}


