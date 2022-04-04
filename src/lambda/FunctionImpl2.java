package lambda;

import java.util.function.Function;

public class FunctionImpl2 {

    public static void main(String[] args) {

        Function<String, String> func = s->s.replaceAll(" ","");
        String s1 = "my name is gaurav";
        System.out.println(func.apply(s1));
    }
}
