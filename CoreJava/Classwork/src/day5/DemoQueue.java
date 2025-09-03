package day5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(5);
        queue.add(7);

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        Iterator<Integer> it = queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
