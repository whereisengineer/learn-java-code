package lambda;

import java.util.function.Predicate;

public class PredicateImpl6 {

    String username;
    String password;

    PredicateImpl6(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {

        Predicate<PredicateImpl6> predicate = U->U.username.equals("durga")&& U.password.equals("java");

        PredicateImpl6 user1 = new PredicateImpl6("durga", "java1");

        if(predicate.test(user1)){
            System.out.println("user verified!");
        }
        else{
            System.out.println("try again!");
        }

    }
}
