package oops;

class Fruit{
    public Fruit(){
        System.out.println("Super Class Constructor");
        //displaying the object hash code of super class
        System.out.println("Super class object hash code: "+ this.hashCode());

        System.out.println(this.getClass().getName());
    }
}

class Apple extends Fruit{
    public Apple(){
        System.out.println("subclass constructor invoked");
        System.out.println(this.hashCode() + " " + super.hashCode());
        System.out.println(this.getClass().getName() + super.getClass().getName());
    }
}


public class ObjectInInheritance {
    public static void main(String[] args) {
        Apple myApple = new Apple();
    }

}
