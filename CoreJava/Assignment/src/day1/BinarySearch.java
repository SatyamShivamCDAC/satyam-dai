import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] Args){
	
		Scanner sc = new Scanner(System.in);
		int[] arr = {2,4,6,8,10};
		System.out.println("Your array is - ");
		for(int i = 0;i<5;i++){
			System.out.print(arr[i] + " ");
			
		}
		int start = 0;
		int end = arr.length - 1;
		int mid = (end + start) / 2;
		System.out.println("\nwrite a number to be found in array");
		int num = sc.nextInt();		
		boolean isFound = false;
		while (start <= end){
			if(arr[mid] == num){
				isFound = true;
				break;
			}
			
			else if(arr[mid] > num){
				end = mid-1;
				mid = (start + end) / 2;
			}
			
			
			else if(arr[mid] < num){
				start = mid+1;
				mid = (start + end) / 2;
			}
		}
		
		if(isFound){
			System.out.println(num + " is found in array");
		}
		
		else{
			System.out.println(num + " is not found in array");
		}
			
	}
}
