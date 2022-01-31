
/*
* There are two types of methods in Java :
* 1. Static method
* 2. Instance method
*
* Static method is class-level method. Can be accessed anywhere and from anyone in class without requiring
* any object.
* Static method are available to everyone in the class as they are shared methods. Same hold true for
* static variables.
*
* Instance methods are object level methods. They require objects to called off. Instance method can be
* accessed through object only.
* Same holds valid for instance variables.
*
* Instance content can access static content directly but static content needs object to access
* instance content.
*
* */



package basics;

public class MethodType {

    //static variable
    static int bankBalance = 1000;

    //static method
    public static int getBalance(){
        return bankBalance;    //note that static variable is accessed within static method
    }

    //instance variable
    int withdrawlAmt;

    //instance method
    public void withdraw(int amount){
        withdrawlAmt = amount;
        bankBalance = bankBalance - withdrawlAmt;   //static variable accessed within instance method.

        System.out.println(getBalance());  //static method called within instance method
    }



    public static void main(String[] args) {

        //can access instance method without creating an object.
        //So creating an object
        MethodType trans = new MethodType();
        System.out.println(getBalance()); //accessing another static method within this static method

        //accessing instance method with the help of class object
        System.out.println("Initiating Withdrawal....");
        trans.withdraw(200);

        //accessing instance variable within static method.
        trans.withdrawlAmt = 300;
        System.out.println("Amount to be withdraw is " +  trans.withdrawlAmt);

        //assigning the value of instance variable to static variable
        bankBalance =  trans.withdrawlAmt;
        System.out.println(getBalance());


    }
}
