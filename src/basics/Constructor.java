package basics;

public class Constructor {
    String name;
    int age;

    Constructor(){
        System.out.println("no arg constructor called.");
    }

    Constructor(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("parameterized constructor called.");
        System.out.println("Name and age is " + this.name + ", " + this.age);
    }
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor("gaurav", 27);


    }
}
