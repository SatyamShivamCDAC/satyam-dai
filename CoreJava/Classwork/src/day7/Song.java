package day7;

import java.util.Set;

public class Song {
    public String title;
    public Set<String> singers;
    public int rating;
    public int releaseYear;
    public String movie;

    public Song(String title, Set<String> singers, int rating, int releaseYear, String movie) {
        this.title = title;
        this.singers = singers;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.movie = movie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<String> getSingers() {
        return singers;
    }

    public void setSingers(Set<String> singers) {
        this.singers = singers;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", singers=" + singers +
                '}';
    }
}
