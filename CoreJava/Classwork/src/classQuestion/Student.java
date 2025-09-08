package classQuestion;

import java.time.LocalDate;

public class Student {
    private String Pnr;
    private String name;
    private int age;
    private Course course;
    private LocalDate enrollmentDate;
    private double gpa;
    private String city;

    public Student(String pnr, String name, int age, String course, LocalDate enrollmentDate, double gpa, String city) {
        Pnr = pnr;
        this.name = name;
        this.age = age;
        this.course = Course.valueOf(course);
        this.enrollmentDate = enrollmentDate;
        this.gpa = gpa;
        this.city = city;
    }

    public String getPnr() {
        return Pnr;
    }

    public void setPnr(String pnr) {
        Pnr = pnr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return String.valueOf(course);
    }


    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
