package lambda;

import java.util.function.Predicate;

public class PredicateImpl {

    public static void main(String[] args) {

        Predicate<Integer> p = I ->I>100;

        System.out.println(p.test(10));
        System.out.println(p.test(101));
    }
}
