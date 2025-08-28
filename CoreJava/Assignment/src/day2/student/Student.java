package day2.student;

public class Student {

    private int rollNumber;
    private String name;
    private int[] marks;

    public Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage(){
        double sum = 0;
        for(int mark : marks){
            sum = sum + mark;
        }
        return sum / marks.length;
    }

    public double calculatePercentage(){
        double sum = 0;
        for(int mark : marks){
            sum = sum + mark;
        }
        double total = marks.length*100;
        return (sum/total)*100;
    }

    public void displayStudentDetails(){
        System.out.print("Student Details are - ");
        System.out.println("Name : " + this.name);
        System.out.println("Roll number : " + this.rollNumber);
        System.out.print("Marks : ");
        for(int mark : marks){
            System.out.print(mark + " ");
        }
        System.out.print("\n");
        System.out.println("Average is " + calculateAverage());
        System.out.format("Percentage is %.1f",calculatePercentage() );
    }
}
