package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingImpl3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if(age < 18){
            throw new LetsThrowException("age is less");
        }
        else{
            System.out.println("everything is fine!");
        }
    }
}
