package day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(100,"String");
        map1.put(200,"Man");
        map1.put(300,"tyt");

        for(int key : map1.keySet()){
            System.out.println(key + " - " + map1.get(key));
        }


        Map<Integer,String> map2 = new TreeMap<>();
        map1.put(100,"String");
        map1.put(200,"Man");
        map1.put(300,"tyt");

        for(int key : map2.keySet()){
            System.out.println(key + " - " + map2.get(key));
        }

    }
}
