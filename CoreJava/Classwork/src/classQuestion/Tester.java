package classQuestion;

import java.time.LocalDate;
import java.util.List;

import static classQuestion.Course.DAI;

public class Tester {

    public static void main(String[] args) {
        Student student1 = new Student("102","Shivam",22,"DAI", LocalDate.of(2025,8,19),9.3,"Nanded");
        Student student2 = new Student("103","Abhinav",22,"DBDA", LocalDate.of(2025,8,19),8.9,"Rorkee");
        Student student3 = new Student("103","Satyam",22,"DAI", LocalDate.of(2025,8,19),9.5,"Bhopal");
        Student student4 = new Student("104","Umang",23,"DAI", LocalDate.of(2025,8,19),9.4,"Nagpur");
        Student student5 = new Student("102","Sunil",26,"DAC", LocalDate.of(2025,8,19),8.6,"Bhopal");
        Student student7 = new Student("104","Pratham",22,"DBDA", LocalDate.of(2025,8,19),9.1,"Kota");
        Student student6 = new Student("104","Piyush",24,"DAI", LocalDate.of(2025,8,19),8.8,"Mumbai");


        List<Student> students = List.of(student1,student2,student3,student4,student5,student6,student7);


        System.out.println(StudentList.getStudentNameByCourse(students,"DAI"));

        System.out.println("----------------------------------------------------");
        System.out.println(StudentList.getStudentAboveGpa(students,9.2));

        System.out.println("----------------------------------------------------");
        System.out.println(StudentList.getStudentCitites(students));


        System.out.println("----------------------------------------------------");
        System.out.println(StudentList.studentCourseDistribution(students));


        System.out.println("----------------------------------------------------");
        System.out.println(StudentList.studentCourseDistribution(students));

        System.out.println("----------------------------------------------------");
        System.out.println(StudentList.getTopNStudents(students,4));
    }
}
