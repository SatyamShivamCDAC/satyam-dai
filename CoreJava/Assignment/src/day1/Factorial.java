import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number :");
		int number = scanner.nextInt();
		int ans = 1;
		for(int i = 1;i <= number;i++){
			ans = ans*i;
		}
		System.out.println("Factorial of " + number + " is " + ans);
	}
}
