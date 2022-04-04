package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamImpl2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(11);
        list.add(0);

        long count = list.stream().filter(i->i%2==0).count();

        System.out.println("count of even numbers is "+ count);

        List<Integer> l1 = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());

        System.out.println(l1);

        Integer min = l1.stream().min((i1,i2)->i1.compareTo(i2)).get();
        Integer max = l1.stream().max((i1,i2)->i1.compareTo(i2)).get();

        System.out.println("min value is "+min);
        System.out.println("max value is "+max);
    }
}
