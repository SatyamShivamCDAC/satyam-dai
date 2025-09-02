package day7.Twitter;

import java.util.Date;
import java.util.Set;

public class Tweet {
    private String subject;
    private int day;
    private int month;
    private int year;
    private int noOfViews;
    private Set<String> hashtages;


    public Tweet(String subject, int day, int month, int year, int noOfViews, Set<String> hashtages) {
        this.subject = subject;
        this.day = day;
        this.month = month;
        this.year = year;
        this.noOfViews = noOfViews;
        this.hashtages = hashtages;
    }

    public String getSubject() {
        return subject;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getNoOfViews() {
        return noOfViews;
    }

    public Set<String> getHashtages() {
        return hashtages;
    }

    @Override
    public String toString() {
        return "{" +
                "subject='" + subject + '\'' +
                ", noOfViews=" + noOfViews +
                '}';
    }
}
