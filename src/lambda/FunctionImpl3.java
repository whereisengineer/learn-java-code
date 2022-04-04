package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionImpl3 {

    String emp_name;
    double emp_salary;

    FunctionImpl3(String name, double salary){
        emp_name = name;
        emp_salary = salary;
    }

    public static void main(String[] args) {

        ArrayList<FunctionImpl3> list = new ArrayList<>();
        list.add(new FunctionImpl3("gaurav",100000));
        list.add(new FunctionImpl3("gaurav2",100000));
        list.add(new FunctionImpl3("gaurav3",100000));
        list.add(new FunctionImpl3("gaurav4",100000));

        Function<ArrayList<FunctionImpl3>, Double> func = mylist->{
            double total=0;
            for(FunctionImpl3 list1 : mylist){
              total = total + list1.emp_salary;
            }

            return total;
        };

        System.out.println("Total salary is "+ func.apply(list));

    }
}
