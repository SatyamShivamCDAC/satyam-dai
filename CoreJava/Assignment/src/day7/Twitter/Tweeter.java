package day7.Twitter;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tweeter {



    public static void main(String[] args) {

        Set<String> hashtags1 = Set.of("SCO Summit","Modi Visit","India");
        Set<String> hashtags2 = Set.of("Tariff","Donald Trump");
        Set<String> hashtags3 = Set.of("Virat Kolhi","India");
        Set<String> hashtags4 = Set.of("Ganesh Charturthi","Pune Celebration");
        Set<String> hashtags5 = Set.of("CDAC","Placement");
        Set<String> hashtags6 = Set.of("India","SCO","Russia");

        Tweet tweet1 = new Tweet("Sco Summit",30,8,2025,14000,hashtags1);
        Tweet tweet2 = new Tweet("Donald Trump",28,7,2025,15000,hashtags2);
        Tweet tweet3 = new Tweet("Virat Kolhi",25,6,2025,9000,hashtags3);
        Tweet tweet4 = new Tweet("Ganesh Chaturthi",26,8,2025,20000,hashtags4);
        Tweet tweet5 = new Tweet("CDAC Placement",25,8,2025,1500,hashtags5);
        Tweet tweet6 = new Tweet("India",28,7,2025,15000,hashtags6);


        List<Tweet> Tweets = List.of(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6);


        Stream<Tweet> stream = Tweets.stream();
//        System.out.println("-----current month tweet------");
//        stream.filter(t -> t.getMonth() == 8).forEach(System.out::println);


//        System.out.println("-----Tweet for Hastag--------")
//        Predicate<Tweet> tweetForHastage = t->t.getHashtages().contains("India");
//        stream.filter(tweetForHastage).forEach(System.out::println);

//        System.out.println("-----Number of Tweet for Subject------");
//        Map<String,List<Tweet>> listBySubject = stream.collect(Collectors.groupingBy(Tweet::getSubject));
//        for(String key:listBySubject.keySet()){
//            System.out.println(key + " - " +  listBySubject.get(key).size());
//        }


//        System.out.println("------tweet with more than 10k views----");
//        stream.filter(t->t.getNoOfViews()>=10000).forEach(System.out::println);


        System.out.println("---top 5 trending topics-----");
        Comparator<Tweet> trending = Comparator.comparing(Tweet::getYear).thenComparing(Tweet::getMonth).thenComparing(Tweet::getNoOfViews).reversed();
        stream.sorted(trending).limit(5).forEach(System.out::println);

    }

}
