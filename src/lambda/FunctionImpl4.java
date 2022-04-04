package lambda;

import java.util.Locale;
import java.util.function.Function;

public class FunctionImpl4 {

    public static void main(String[] args) {
        Function<String, String> f1 = s->s.substring(0,5);
        Function<String,String> f2 = s->s.toLowerCase();

        String s = "GAURAV";
        System.out.println(f1.andThen(f2).apply(s));
    }
}
