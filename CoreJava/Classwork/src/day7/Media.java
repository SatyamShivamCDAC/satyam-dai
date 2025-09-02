package day7;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Media {



    public static  List<Song> createPlaylist(){

        List<Song> playlist = new ArrayList<Song>();

        Set<String> singer1 = new TreeSet<>();
        singer1.add("S");
        singer1.add("SH");

        Set<String> singer2 = new TreeSet<>();
        singer2.add("CH");
        singer2.add("S");

        Set<String> singer3 = new TreeSet<>();
        singer3.add("CO");
        singer3.add("WH");

        Set<String> singer4 = new TreeSet<>();
        singer4.add("S");
        singer4.add("OP");

        playlist.add(new Song("Ganna",singer1,9,2022,"mm1"));
        playlist.add(new Song("Song",singer2,8,2022,"hmm"));
        playlist.add(new Song("Sangeet",singer3,7,2021,"yyoy"));
        playlist.add(new Song("Music",singer4,9,2024,"mm1"));

        return playlist;
    }


    public static void main(String[] args) {
        List<Song> playlist = createPlaylist();
        Stream<Song> stream = playlist.stream();

//        Predicate<Song> bySinger = s -> s.getSingers().contains("S");
//        stream.filter(bySinger).forEach(System.out::println);

        System.out.println("------for movies ------");
        stream = playlist.stream();
        Predicate<Song> forMovie = s->s.getMovie() == "mm1";
        stream.filter(forMovie).forEach(System.out::println);

        System.out.println("------movie title ->  songs------");
        stream = playlist.stream();
        Map<String,List<Song>> movieGrp = stream.collect(Collectors.groupingBy(Song::getMovie));
        System.out.println(movieGrp);

        System.out.println("------Sort by title------");
        stream = playlist.stream();
        Comparator<Song> sortByTitle = Comparator.comparing(Song::getTitle);
        stream.sorted(sortByTitle).forEach(System.out::println);

        System.out.println("------sort by year------");
        stream = playlist.stream();
        Comparator<Song> sortByYear = Comparator.comparing(Song::getReleaseYear);
        stream.sorted(sortByYear).forEach(System.out::println);

        System.out.println("------sort by realease year then movies------");
        stream = playlist.stream();
        Comparator<Song> sortByYearAndMovie = Comparator.comparing(Song::getReleaseYear).thenComparing(Song::getMovie);
        stream.sorted(sortByYearAndMovie).forEach(System.out::println);
        
    }
}
