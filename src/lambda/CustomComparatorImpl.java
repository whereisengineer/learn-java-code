package lambda;

import java.util.*;

public class CustomComparatorImpl {

    int emp_id;
    String emp_name;

    CustomComparatorImpl(int emp_id, String emp_name){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public String toString(){
        return emp_id + ":" + emp_name;
    }

    public static void main(String[] args) {
        List<CustomComparatorImpl> list = new ArrayList<>();
        list.add(new CustomComparatorImpl(2, "g1"));
        list.add(new CustomComparatorImpl(10, "g2"));
        list.add(new CustomComparatorImpl(1, "g3"));
        list.add(new CustomComparatorImpl(100, "g4"));
        list.add(new CustomComparatorImpl(0, "g5"));

        Collections.sort(list,
                (O1, O2)->O1.emp_id < O2.emp_id ? -1 : O1.emp_id > O2.emp_id ? 1 : 0
                );

        System.out.println(list);




    }
}
