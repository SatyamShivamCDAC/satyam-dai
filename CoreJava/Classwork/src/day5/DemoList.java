package day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        List lst = new ArrayList<>();

        lst.add(2);
        lst.add("String");
        lst.add(2.5);
        lst.add('n');
        lst.add(true);

        System.out.println(lst);

        lst.remove(2.5);

        System.out.println(lst);

        Iterator it = lst.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
