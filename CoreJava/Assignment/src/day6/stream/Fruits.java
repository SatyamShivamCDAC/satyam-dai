package day6.stream;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fruits {

    public static boolean isUpper(String word){
        if(word.charAt(0)-65<=26){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] fruits = {"MANGO", "ORANGE", "GRAPES", "apple", "Banana", "strawberry", "Watermelon"};

        Stream<String> stream = Arrays.stream(fruits);

//        List<String> upper = stream.map((s -> s.toUpperCase())).collect(Collectors.toList());
//        System.out.println(upper);

//        List<String> lower = stream.map(String::toLowerCase).collect(Collectors.toList());
//        System.out.println(lower);



//        List<String> lessThanN = stream.filter(s->Character.getNumericValue(s.charAt(0))<='n').sorted(new UnicodeComparator()).collect(Collectors.toList());
//        System.out.println(lessThanN);


        List<String> lessThanNDesc = stream.filter(s->Character.getNumericValue(s.charAt(0))<='n').sorted(new UnicodeComparatorDesc()).collect(Collectors.toList());
        System.out.println(lessThanNDesc);


//
//        List<String> isUpper = stream.filter(Fruits::isUpper).collect(Collectors.toList());
//        System.out.println(isUpper);

//        List<String> lessThan6 = stream.map(String::toLowerCase).filter(s->s.length()<=6).sorted(new ReverseLenghtCompartor()).collect(Collectors.toList());
//        System.out.println(lessThan6);
    }
}
