package day6.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class demoStream {

    public static boolean isEven(int n){
        if (n%2==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8,12,9,22,10,44,15};
        IntStream stream = Arrays.stream(arr);

//        List<Integer> lst = stream.map(n->n*2).boxed().collect(Collectors.toList());
//
//        System.out.println(lst);
//

        stream.filter(demoStream::isEven).forEach(System.out::println);


    }
}
