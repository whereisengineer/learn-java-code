//Implement a compare method.

package collections;

import java.util.*;

class SortList implements Comparator<Integer>{

    public int compare(Integer i1, Integer i2){

        return i1>i2 ? -1 : i1<i2 ? 1 :0 ;

    }
}

public class ComparatorImpl {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(5);
        list.add(100);

        Collections.sort(list, new SortList());

        System.out.println(list);

    }
}
