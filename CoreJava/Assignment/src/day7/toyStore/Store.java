package day7.toyStore;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Store {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Toy car = new Toy(101, "Car", 500, "Sports", "Adolescent",  2025);
        Toy doll = new Toy(102, "Doll", 200, "Girls", "Child",  2024);
        Toy cube = new Toy(103, "Cube", 100, "Puzzle", "Adult",  2023);
        Toy bat = new Toy(104, "Bat", 1000, "Sports", "Adult",  2019);
        Toy makeUpKit = new Toy(105, "Make Up Kit", 150, "Girls", "Infant",  2025);

        List<Toy> toys = List.of(car,doll,cube,bat,makeUpKit);

        Stream<Toy> stream = toys.stream();

        System.out.println("----------------List of stock----------------");
        stream.forEach(System.out::println);

        System.out.println("----------------Group by category----------------");

        stream = toys.stream();
        Map<String, List<Toy>> toysByCategory = stream.collect(Collectors.groupingBy(Toy::getCategory));
//
//        Map<String,List<Toy>> toysByCategory = stream.collect(Collectors.groupingBy(Toy::getCategory));
        System.out.println(toysByCategory);

        System.out.println("------------------------Toys between price range------------------");
        stream = toys.stream();
        System.out.print("Write min price :- ");
        int min = sc.nextInt();

        System.out.print("Write max price :- ");
        int max = sc.nextInt();
        stream.filter(t->t.getPrice()>=min&&t.getPrice()<=max).forEach(System.out::println);
//
        System.out.println("------------------------Toys between price range------------------");
        Comparator<Toy> priceCategoryComp = Comparator.comparing(Toy::getPrice);
        stream = toys.stream();
        Map<String,List<Toy>> toybyPriceCategory= stream.sorted(priceCategoryComp).collect(Collectors.groupingBy(Toy::getCategory));
        System.out.println(toybyPriceCategory);

        System.out.println("------------------------Toys older than year------------------");
        stream = toys.stream();
        stream.filter(t->t.getYear()<=2024).forEach(System.out::println);
        System.out.println("------------------------Toys by category------------------");
        for(String key:toysByCategory.keySet()){
            System.out.println(key + " - "+ toysByCategory.get(key).size());
        }
//
//
        System.out.println("----------------------Most Expensive Toy and Least Expensive Toy------------------");
        stream = toys.stream();
        System.out.println("Most Expensive toy " + stream.max(Comparator.comparing(Toy::getPrice)));;
        stream = toys.stream();
        System.out.println("Least Expensive toy " + stream.min(Comparator.comparing(Toy::getPrice)));;
//

        System.out.println("------------------------Toys by age Group------------------");
        stream = toys.stream();
        Map<String,Long> listOfToys = stream.collect(Collectors.groupingBy(Toy::getAgeGroup,Collectors.counting()));

        System.out.println(listOfToys);

//        Map<String, Long> listOfToys = stream
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    }
}
