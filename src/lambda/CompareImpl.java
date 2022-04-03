package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareImpl {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(5);
        list.add(100);

        Comparator<Integer> c1 = (I1, I2)-> I1 > I2 ? -1 : I1<I2 ? 1 :0;
        Collections.sort(list, c1);
        System.out.println(list);

    }
}
