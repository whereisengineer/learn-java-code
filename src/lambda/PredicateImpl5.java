package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateImpl5 {

    public static void main(String[] args) {

        String[] names = {"Durga", null, "", "ravi", "bhusan"};

        Predicate<String> p = s-> s!=null && s.length()!=0;

        ArrayList<String> list = new ArrayList<>();

        for(String str: names){
            if(p.test(str)){
                list.add(str);
            }
        }

        System.out.println(list);

    }
}
