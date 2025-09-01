package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Number {


    public static List<Integer> operateOnNumber(Predicate<Integer> predicate, List<Integer> nums){
        List<Integer>  arrNum = new ArrayList<>();
        for(int num : nums){
            if(predicate.test(num))
                arrNum.add(num);
        }
        return  arrNum;
    }

    public static boolean isPrime2(int n){
        for(int i = 2 ; i <=n/2 ;i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isDivisible(int n){
        if( n%2==0 || n%3 == 0 || n%5 == 0 ){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Predicate<Integer> isPositive = (n) -> n>0;
        Predicate<Integer> isPrime = (n) -> {

            for(int i = 2 ; i <=n/2 ;i++){
                if(n % i == 0)
                    return false;
            }
            return true;
        };





//        System.out.println(isPositive.test(-6));
//        System.out.println(isPrime.test(4));

        Predicate<Integer> isPrime2 = Number::isPrime2;

//        System.out.println(isPositive.test(-6));
//        System.out.println(isPrime.test(4));
        System.out.println(isPrime2.test(9));


        List<Integer> list = List.of(2,7,1,4,8,10,9);

//        List<Integer> list1 = operateOnNumber((n)->(n%2==0),list);
//        System.out.println(list1);

        List<Integer> list2 = operateOnNumber(Number::isDivisible,list);
        System.out.println(list2);


    }
}
