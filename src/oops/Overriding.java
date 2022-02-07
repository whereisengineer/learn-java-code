package oops;

// Parent class

class Parent{
     void show(){
        System.out.println("Parent class show method");
    }

    Parent sum(){
        System.out.println("sum method called");
        return new Parent();

    }

    final void finalParentMethod(){
        System.out.println("final parent method");
    }

    private void privateParentMethod(){
        System.out.println("private parent method");
    }

    static void staticParentMethod(){
        System.out.println("parent static method");
    }


}

//Child class

class Child extends  Parent{
    void show(){
        System.out.println("Child class show method");
    }

//    Covariant return type will work in overriding. Child class return type should be subtype of parent type.

    Child sum(){
        System.out.println("child method with child return type called");
        return new Child();
    }

    void anotherChildMethod(){
        System.out.println("Another child method");
    }

//    void finalParentMethod(){
//        // we can not write this method in child class as it
//            is already defined in Parent class as final method.
//    }

      void privateParentMethod(){
        System.out.println("private parent method");
    }

    static void staticParentMethod(){
        System.out.println("Child static method");
    }
}



public class Overriding {
    public static void main(String[] args) {

        Parent pObj = new Child();
        pObj.show();
        pObj.staticParentMethod();  //Method hiding
        pObj.sum();
//      pObj.anotherChildMethod();    This will throw compile time error.
    }
}
