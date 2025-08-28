import java.util.Scanner;

public class Student {

	private int rollNumber;
	private String name;
	public static int noOfStudents;
	
	
	public Student(){
		rollNumber = 0;
		name = "";
	}
	
	public Student(String name){
		this.rollNumber = ++noOfStudents;
		this.name = name;
		
	}
	
	public int getRollNumber(){
		return this.rollNumber;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setRollNumber(int rollNumber){
		this.rollNumber = rollNumber;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return "Name : " + name + "\nRoll Number : "+ rollNumber;
	}
	
	public static void displayStudentCount(){
		System.out.println("Number of Student - " + noOfStudents);
	}
	
	public static void main(String[] args){
		Student student1 = new Student("Satyam");
		Student student2 = new Student("Shivam");
		Student student = new Student();
		Student student3 = new Student("Himanshu");
		
		System.out.println(student1);
		System.out.println(student2);	
		System.out.println(student3);	
		System.out.println(student);
		
		Student.displayStudentCount();
		
		Student[] students = new Student[5];
		Scanner scanner = new Scanner(System.in);	
		for(int i = 0; i < students.length; i++){
			
			System.out.println("Write the student name with roll number " + noOfStudents);
	
			students[i] = new Student(scanner.nextLine());			
		
		}
		
		for(int i = 0; i < students.length; i++){
			
			System.out.println(students[i].getName());			
		
		}
		
		
	}
}
