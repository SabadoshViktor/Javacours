package tel_ran.book.data;

public class ArrayTools {
	
	public static void printArray(Book arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].display();
		}
		System.out.println();
	}
	
	public static void fillArray(int arr[], int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]=min+(int)(Math.random()*(max-min+1));
			
		}
	}
	
	public static void countDigits(int num){
		int i=0;
		do{
			num=num/10;
			i++;
		}
		while(num!=0); 
		System.out.println(i);
		//System.out.println("In this number : %d symbols" +i);

	}
	
	
	
	
	public static int searchIndex(int arr[], int num){
		for (int i=0; i<arr.length; i++){
			if(arr[i]==num){
				return i;
				//System.out.println(i);
			}
		}
		return -1;
	}
	
	
	
	public static int sumArray(int arr[]){
		int res=0;
		for(int i=0; i<arr.length; i++){
			res=arr[i]+res;

		}
		return res;
	}
	
	
	
	public static int maxValue(int arr[]){
		int max=arr[0];
		for (int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	
	
	public static int minValue(int arr[]){
		int min=arr[0];
		for (int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
	
	/*public static int toArray(int arr[],int num){ 
		int res;
		for(int i=0; i<arr.length; i++){
			res=num%10;
			num=num/10;
			arr[i]=res;

		}
		return 0;
	}*/
	
	public static void selectionSort(int arr[]){
		int temp;
		for(int i=0; i<arr.length; i++){
			int j=minInRange(arr, arr.length, i);
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
	private static int minInRange(int[] arr, int length, int i) {
		return 0;
	}

	public static int minInRange(int arr[] , int start){
		int min=start;
		for(int i=start; i<arr.length; i++){
			if(arr[i]<arr[min]){
				min=i;
			}
		}
		return min;
	}
	
	public static int binarySearch(int arr[], int num) {
		for(int l=0, r=arr.length-1; l<=r;){
			int med=(l+r)/2;
			if(arr[med]==num){
				return med;
			}
			if(arr[med]>num){
				r=med-1;
			}
			if(arr[med]<num){
				l=med+1;
			}
		}
		return -1;
	}
	
	public static void bubbleSort(int arr[]){
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}