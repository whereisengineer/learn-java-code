package oops;

abstract class Shape{
    abstract double area();
    int length;
    int breadth;

    Shape(){
        System.out.println("Abstract class Shape constructor called.");
    }

     static void staticMethod(){
         System.out.println("This is static method from Abstract class Shape");
    }

    final void finalMethod(){
        System.out.println("This is Final Method from Abstract class Shape");
    }
}

class Circle extends Shape{

    Circle(int radius){
        System.out.println("Circle constructor called.");
        length = radius;
    }

    double area(){
        return 3.14 * length* length;
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Shape obj = new Circle(12);

        System.out.println( obj.area());

        obj.finalMethod();
        Shape.staticMethod();
    }
}
