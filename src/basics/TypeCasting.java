package basics;

import java.sql.SQLOutput;

public class TypeCasting {


    public static void main(String[] args) {
        //implicit type casting
        byte b = 1;
        int bint = b;  //byte is converted to int internally.
        System.out.println(bint);

//        explicit type casting
        int oneInt = 2;
        byte oneByte = (byte)oneInt;  //int is converted to byte manually.
        System.out.println(oneByte);

        float oneFloat = oneInt;   //value of oneInt is converted to float internally.
        System.out.println(oneFloat);

        char oneChar = 'a';
        oneByte = (byte)oneChar;  //value of oneChar is converted to byte manually due to narrow type casting.
        System.out.println(oneByte);

        oneInt = oneChar;  //value of oneChar is converted to int internally due to widening type casting.
        System.out.println(oneInt);

        oneByte = 2;
        oneByte =(byte)(oneByte * 2); //since 2 is integer, so expression needs to be type casted to byte.
        System.out.println(oneByte);



    }
}
