package lambda;

import java.util.function.Predicate;

public class Predicateimpl4 {

    public static void main(String[] args) {
        String[] names = {"Sunny", "Kajol", "Katrina", "Kareena", "Deepika"};

        Predicate<String> p = s->s.charAt(0) == 'K';

        for(String s : names){
            if(p.test(s)){
                System.out.println(s);
            }
        }
    }
}
