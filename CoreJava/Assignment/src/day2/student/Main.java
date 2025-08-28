package day2.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write Student detail - ");
        System.out.print("Roll Number  - ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Name  - ");
        String name = sc.nextLine();
        int[] marks = new int[5];
        System.out.println("Marks obtained - ");
        for(int i = 0; i < 5 ; i++){
            marks[i] = sc.nextInt();
        }



        Student satyam = new Student(roll,name, marks);

//        System.out.println(satyam.calculateAverage());
//        System.out.println(satyam.calculatePercentage());

        satyam.displayStudentDetails();
    }
}
