package lambda;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierImpl1 {

    public static void main(String[] args) {

        Supplier<Date> supplier = ()->new Date();

        System.out.println(supplier.get());

        Supplier<String> s2 = ()->{
            String[] str = {"a1", "b1", "c1","d1"};
            int x =(int) (Math.random()*4);
            return str[x];
        };

        System.out.println(s2.get());
    }
}
