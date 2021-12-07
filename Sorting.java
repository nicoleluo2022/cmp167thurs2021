import java.util.Arrays;

public class Sorting {
	public static void bubbleSort(int [] arr) {
		int n = arr.length;
		for (int i = 0; i<n-1; i++) {
			for (int j=0; j<n-i-1;j++) {
				if (arr[j]>arr[i+1]) {
					//swap
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
					
			}
		}
	}
}
	  public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }}
	  public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }}

	//implement and research about the insertionSort and selectionSort
	public static void main(String[] args) {
		int [] numbers = {4,1,2,3,5};
		bubbleSort(numbers);
		insertionSort(numbers);
		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	    }  

}
