public class BubbleSort{

	public static void main(String[] args){
		
		
		int[] arr = {2,5,3,6,1};
		System.out.print("your unsorted Array is  ");
		for(int i = 0; i< arr.length ; i++){
			System.out.print(arr[i] + " ");
		}	
		for(int i = arr.length -1; i > 0; i--){
			for (int j = 0 ; j < i ; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
		}
		System.out.print("\nyour Sorted Array is  ");
		for(int i = 0; i< arr.length ; i++){
			System.out.print(arr[i] + " ");
		}		
		System.out.print("\n");
	}
	
}
