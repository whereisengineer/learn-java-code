package lambda;

import org.w3c.dom.stylesheets.DocumentStyle;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerImpl3 {

    String name;
    int marks;

    ConsumerImpl3(String name, int marks){
        this.name = name;
        this.marks = marks;
    }



    public static void main(String[] args) {

        ArrayList<ConsumerImpl3> list = new ArrayList<>();
        list.add(new ConsumerImpl3("stu1",74));
        list.add(new ConsumerImpl3("stu2",10));
        list.add(new ConsumerImpl3("stu3",60));
        list.add(new ConsumerImpl3("stu4",90));


        Predicate<ConsumerImpl3>  predicate = P -> P.marks>=60;

        Function<ConsumerImpl3,String> function = F ->{
            if(F.marks >=80)return "A";
            else if(F.marks >=60) return "B";
            else return "C";
        };

        Consumer<ConsumerImpl3> consumer = C-> System.out.println(C.name + " " + C.marks + " " +function.apply(C));

        for(ConsumerImpl3 obj : list){
            if(predicate.test(obj)){
                consumer.accept(obj);
            }
        }




    }

}
