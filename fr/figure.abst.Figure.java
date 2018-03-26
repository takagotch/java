//abstract ([type arg1, ... argN])
//abstract

abstract class Figure {
  abstract float getArea();
}
class Square extends Figure {
  float width;
  float height;

  Square( float width, float height ){
    this.width = width;
    this.height = height;
  }
  float getArea() { return this.width * this.height; }
}
class Circle extends Figure {
  float radius;

  Circle(float radius){
    this.radius = radius;
  }
  float getArea(){
    return this.radius * this.radius * 3.14f; }
}
class Triangle extends Figure {
  float base;
  float height;

  Triangle(float base, float height){
    this.base = base;
    this.height = height;
  }
  float getArea(){
    return this.base * this.height / 2; }
}

class FigureDemo {
  public static void main(String args[]){
  
  Figure fig;
  fig = new Square(2, 3);
  System.out.println(fig.getArea());

  fig = new Circle(2);
  System.out.println(fig.getArea());

  fig = new Triangle(2, 3);
  System.out.println(fig.getArea());
  }
}


