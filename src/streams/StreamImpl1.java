package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamImpl1 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("gaurav");
        list1.add("devanshu");
        list1.add("saksham");
        list1.add("muskan");

        List<String> l1 = list1.stream().filter(s->s.length()>6).collect(Collectors.toList());

        List<String> l2 = list1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());

        System.out.println(l1);
        System.out.println(l2);
    }
}
