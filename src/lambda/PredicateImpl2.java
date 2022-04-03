package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImpl2 {

    public static void main(String[] args) {

        //check whether length of string is greater or less than something.
        String s= "gaurav";

        Predicate<String> p = q -> q.length()>5;

        System.out.println(p.test(s));

        //Check whether particular collection is empty or not.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        Predicate<Collection> p1 = list1 -> list.isEmpty();

        System.out.println(p1.test(list));



    }
}
