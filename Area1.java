abstract class Shape{
double ar;
public abstract void findArea();
public void printArea(){
System.out.println("Area= "+ar);
}
}
class Circle extends Shape{
public void findArea(){
double r=6.2;
ar=3.14*r*r;
}
}
class Rectangle extends Shape{
public void findArea(){
double l=2.3, b=5.5;
ar=l*b;
}
}
class Triangle extends Shape{
public void findArea(){
double b=2.2, h=9.1;
ar=(b*h)/2;
}
}
class Area1{
public static void main(String args[]){
Shape s;
s=new Circle();
s.findArea();
s.printArea();
s=new Rectangle();
s.findArea();
s.printArea();
s=new Triangle();
s.findArea();
s.printArea();
}
}