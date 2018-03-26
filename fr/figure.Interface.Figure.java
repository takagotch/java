//interface ()
//class implements()
//interface extends ()

interface GetAreable
{
  float getArea();
}

class Square implements GetAreable
{
  float width;
  float height;

  Square(float width, float height){
    this.width = width;
    this.height = height;
  }

  public float getArea(){
    return this.width * this.height;
  }

  class FigureDemo{
    public static void main(String args[]){
      Square sqa = new Square(2, 3);
      System.out.println("SQUARE: " + sqa.getArea());
    }
  }
}


