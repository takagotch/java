//([type arg1, ... argN])

class Square
{
  float width;
  float height;

  float getArea(){
    return this.width * this.height;
  }
}

public class SquareMember {
  public static void main(String args[]){
    Square sqar = new Square();

    sqar.width = 10;
    sqar.height = 5;

    System.out.println("SQUARE: " + sqar.getArea());
  }
}

