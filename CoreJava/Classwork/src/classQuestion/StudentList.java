package classQuestion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentList {
//    List<Student> students;
//
//    public StudentList() {
//        this.students = students;
//    }

    public static List<Student> getStudentNameByCourse(List<Student> students, String courseName){
        List<Student> studentByCourse = new ArrayList<>();
        Stream<Student> stream = students.stream();
        studentByCourse = stream.filter(s->s.getCourse().equals(courseName)).collect(Collectors.toList());
        return studentByCourse;
    }
    public static List<Student> getStudentAboveGpa(List<Student> students, double gpa){
        List<Student> studentAboveGpa = new ArrayList<>();
        Stream<Student> stream = students.stream();
        studentAboveGpa = stream.filter(s->s.getGpa()>=gpa).collect(Collectors.toList());
        return studentAboveGpa;
    }

    public static Set<String> getStudentCitites(List<Student> students){
        Set<String> cities = new TreeSet<>();
//        for(Student s : students){
//            cities.add(s.getCity());
//        }
        Stream<Student> stream = students.stream();
        cities = stream.map(Student::getCity).collect(Collectors.toSet());
        return cities;
    }

    public static Map<String,Long> studentCourseDistribution(List<Student> students){
        Stream<Student> stream =  students.stream();
        return stream.collect(Collectors.groupingBy(Student::getCourse,Collectors.counting()));
    }

//    public static double avgGpa(List<Student> students){
//        Stream<Student> stream = students.stream();
//        Stream<Double> gpaStream = stream.map(Student::getGpa).collect(Collectors.to());
//
//    }

    public static List<Student> getTopNStudents(List<Student> students,int limit){
        Stream<Student> stream = students.stream();
        Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa).reversed();

        List<Student> topN = stream.sorted(gpaComparator).limit(limit).collect(Collectors.toList());
        return topN;
    }




}
