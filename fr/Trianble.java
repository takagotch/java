//retType ([type arg1, ... argN]){ [ return retValue; ] }

float getArea(float height, float bottom){
  return height * bottom / 2;
}

void getArea2(float height, float bottom){
  this.area = height * bottom / 2;
}

//class { {  } }
public class Triangle
{
  float x;
  float y;

  float getArea(float height, float bottom){
    return height * bottom / 2;
  }
}


