package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerImpl2 {

    int emp_id;
    String emp_name;

    ConsumerImpl2(int emp_id, String emp_name){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public static void main(String[] args) {
        ArrayList<ConsumerImpl2> list = new ArrayList<>();
        list.add(new ConsumerImpl2(1,"gaurav"));
        list.add(new ConsumerImpl2(2,"gaurav2"));
        list.add(new ConsumerImpl2(3,"gaurav3"));
        list.add(new ConsumerImpl2(4,"gaurav4"));

        Consumer<ConsumerImpl2> consume = C ->System.out.println(C.emp_id + " "+ C.emp_name);

        for(ConsumerImpl2 c : list){
            consume.accept(c);
        }
    }

}
