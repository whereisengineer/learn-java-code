package lambda;

import java.util.function.Function;

public class FunctionImpl1 {

    public static void main(String[] args) {

        Function<String, Integer> func = s->s.length();

        System.out.println(func.apply("gaurav"));
    }
}
