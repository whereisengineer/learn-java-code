package exceptionhandling;

public class ExceptionHandlingImpl1 {

    public static void main(String[] args) {

        try{
            int var = 1/0;
        }
        catch(ArithmeticException e){
            System.out.println("exception is "+ e);
        }

        System.out.println("after catch block");


    }
}
