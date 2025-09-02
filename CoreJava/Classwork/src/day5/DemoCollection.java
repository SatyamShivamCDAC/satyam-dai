package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCollection {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3);
        lst.add(1);
        lst.add(7);
        lst.add(5);

        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);

        System.out.println(Collections.binarySearch(lst,5));

        System.out.println(Collections.min(lst));
        System.out.println(Collections.max(lst));

        Collections.reverse(lst);
        System.out.println(lst);

    }
}
