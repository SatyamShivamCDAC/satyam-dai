package day6.lambda;

import java.util.ArrayList;
import java.util.List;

public class DemoLambda {

    public static int operateOnNumber(Function fun,int a){
        return fun.apply(a);
    }

    public static List<Integer> operateOnNumbers(Function fun, List<Integer> list){
        List<Integer> list2 = new ArrayList<Integer>();
        for(int item : list){
            list2.add(fun.apply(item));
        }
        return list2;
    }

    public static void main(String[] args) {
        Function func = (n)->n*2;

        System.out.println(func.apply(2));

        Function func2 = n->n+4;

        System.out.println(func2.apply(2));

        int temp = operateOnNumber(n->n*10,10);

        System.out.println(temp);

        List<Integer> lst = List.of(2,4,6,8,10);

        List<Integer> lst2 = operateOnNumbers(n->n*2,lst);
        System.out.println(lst2);


    }
}
