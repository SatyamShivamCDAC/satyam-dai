package day5;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Toy chess = new Toy(101,"chess",250,"Board",new int[]{12,18},2021);
        Toy football = new Toy(102,"football",500,"Sports",new int[]{9,18},2022);
        Toy ludo = new Toy(103,"ludo",200,"Board",new int[]{8,15},2023);
        Toy doll = new Toy(104,"doll",300,"Girls",new int[]{2,8},2024);
        Toy drum = new Toy(105,"drum",400,"Boys",new int[]{2,8},2025);
        Toy cube = new Toy(106,"cube",130,"Puzzle",new int[]{12,18},2022);
        Toy car = new Toy(107,"car",250,"Sports",new int[]{5,12},2025);

        Stock stock = new Stock();

        stock.add(football);
        stock.add(chess);
        stock.add(car);
        stock.add(cube);
        stock.add(ludo);
        stock.add(drum);
        stock.add(doll);

//        stock.listStock();


//        System.out.println(stock.filterByCaterory("Sports"));


        Collections.sort(stock.getToys());
//        int result = Collections.binarySearch(stock.getToys(),new Toy(105,null,0,null,null,0));
//        System.out.println(result);

//        System.out.println(stock.toysInPriceRange(300,500));


//        System.out.println(stock.toysForAge(5));


//        Collections.sort(stock.getToys(),new NameComparator());
//        stock.listStock();

//        Collections.sort(stock.getToys(),new PriceComparator());
//        stock.listStock();

//        System.out.println(stock.toyOlderThanYear());

        stock.groupByCategory();


    }

}
