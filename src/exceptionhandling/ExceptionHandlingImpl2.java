package exceptionhandling;

public class ExceptionHandlingImpl2 {

    public static void main(String[] args) {
        boolean shouldNotHappen = false;
        //did some work
       shouldNotHappen = true;
       try{
           if(shouldNotHappen)
               throw new ArithmeticException("whereisengineer");
       }
       catch (ArithmeticException e){
           System.out.println("hey exception here!");
       }

       //normal flow continues...
        System.out.println("normal flow continues");

    }
}
