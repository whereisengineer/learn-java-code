package lambda;

import java.util.function.Predicate;

public class PredicateImpl3 {


    public static void main(String[] args) {

        int[] x = new int[]{0,5,10,15,20,25,30};

        Predicate<Integer> p1 = i->i>10;

        Predicate<Integer> p2 = i->i%2==0;

        System.out.println("Number greater than 10 are ");
        m1(p1,x);

        System.out.println("Number even are");
        m1(p2,x);

        System.out.println("Number less than 10 or equal are");
        m1(p1.negate(),x);

        System.out.println("Number odd are");
        m1(p2.negate(), x);

        System.out.println("Number greater than 10 and even are");
        m1(p1.and(p2), x);

        System.out.println("Number less than 10 and odd");
        m1(p1.negate().and(p2.negate()), x);
    }

    public static void m1(Predicate<Integer> p, int[] x){
        for(int x1 : x){
           if(p.test(x1))
               System.out.print(x1+ " ");
        }
    }
}
