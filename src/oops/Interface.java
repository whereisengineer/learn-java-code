package oops;

interface Vehicle{

//    All fields in interface are public, static and final {aka constant}
    String RTO = "XXYY";
    void getNOC();

//   default method in Interface
    default void defaultMethod(){
        System.out.println("default method called.");
    }

//    static method in Interface
    static void staticMethod(){
        System.out.println("Static method called.");
    }

//    private methods in interface
    private void privateMethod(){
        System.out.println("Private method in interface.");
    }
}


public class Interface implements Vehicle {

    public void getNOC(){
        System.out.println("method overridden from Interface.");
    }

    public static void main(String[] args) {
        Vehicle ref = new Interface();
        ref.getNOC();
        Vehicle.staticMethod();
        ref.defaultMethod();
        System.out.println("RTO number is "+ ref.RTO);

    }
}
