package basics;

public class InstanceBlock {

//Content of instance block are copied into the constructor after its super keyword.This happens everytime
//when object is created.

    InstanceBlock(){
        System.out.println("Constructor called.");
    }

    {
        System.out.println("Instance block.");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();   //Object created.
        InstanceBlock obj2 = new InstanceBlock();   //Object created.
    }
}
