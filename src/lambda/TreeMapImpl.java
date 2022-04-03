package lambda;

import java.util.TreeMap;

public class TreeMapImpl {

    public static void main(String[] args) {
        TreeMap<Integer,String> tree_map = new TreeMap<Integer,String>(
                (I1,I2)->  I1>I2 ? -1 : I1 < I2 ? 1 : 0
        );
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");

        System.out.println(tree_map);
    }


}
