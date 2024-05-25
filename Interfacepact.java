interface Shape
{

double getAera();
}
class Rectangle implements Shape
{
private  double length;
private double width;

public Ractangle(double length,double width){
this.length=length;
this.width=width;

}
public double getAera(){

return length*width;
}
}





class Circle implements Shape
{
private  double Redius;
public Circle(double Redius){
this.Redius=Redius;

}
public double getAera(){

return Math.PI*Redius*Redius;

}
}




class Triangle implements Shape
{
private  double base;
private  double height;

public Triangle(double base,double height){

this.base=base;
this.height=height;

}
public void getAera(){
retrun 0.5*base*height;

}
}

class Interfacepact
{

public  static void main(String args[])
{
Ractangle r=new.Ractangle(12,10);
Circle c=new.Circle(6);
Triangle t=new.Triangle(4,6);
System.out.println("aera of the Rectangle:"+Rectangle.getAera());
System.out.println("aera of the cricle:"+Circlele.getAera());
System.out.println("aera of the triangle:"Triangle.getAera());
}
}