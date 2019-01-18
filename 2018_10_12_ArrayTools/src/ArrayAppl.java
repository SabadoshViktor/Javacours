
public class ArrayAppl {

	public static void main(String[] args) {
		
		int arr1[]= {1,3,4,6,8,35,4564,45};
		int arr2[]= {45,456,23,54,23,23,34,2435};
		
		ArrayTools.printArray(arr1);
		ArrayTools.printArray(arr2);
		
		int arr3[]= new int[10];
		
		ArrayTools.fillArray(arr3, -30, 30);
		ArrayTools.printArray(arr3);
		ArrayTools.countDigits(9784125);
		
		int lenght=arr1.length;
		System.out.println("Lenght is: "+lenght);
		lenght=arr2.length;
		System.out.println("Lenght is: "+lenght);
		lenght=arr3.length;
		System.out.println("Lenght is: "+lenght);
		
	}

}
