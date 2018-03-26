//([type arg1, ... argN]){ }

class Square2
{
  float width;
  float height;

  Square2(float width, float height){
    this.width = width;
    this.height = height;
  }

  float getArea(){
    return this.width * this.height;
  }
}

public class SquareConstructor{
  public static void main(String args[]){
    Square2 sqar = new Square2(10, 5);

    System.out.println("SQUARE: " + sqar.getArea());
  }
}

