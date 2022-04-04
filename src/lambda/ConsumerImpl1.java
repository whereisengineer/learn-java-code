package lambda;

import java.util.function.Consumer;

public class ConsumerImpl1 {

    public static void main(String[] args) {

        Consumer<String> consume = s-> System.out.println(s);
        consume.accept("gaurav");
    }
}
