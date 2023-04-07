package estructurasDatos;

public class Prueba2 {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
		for ( int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i <10 ; i++) {
			arr1[i] = arr1[i] * 2;
		}
		
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int[] arr2 = new int[10];
		
		for (int i = 0 ; i <10 ; i++) {
			arr2[i] = i+1;
			System.out.print(arr2[i] + " ");
		}
		
		int n = 10;
		
		int[] arr3 = new int[n];
		
		for (int i = 0;i < arr2.length ; i++) {
			arr3 [i] = arr2[i] * 2;
		}
		
		System.out.println();
		
		int[] arr4 = new int[10];
		
		for (int i = 0; i < arr2.length ; i++) {
			arr4[arr4.length - i] = arr2[i];
		}
		
		for (int i : arr4) {
			System.out.println(i);
		}
		
	}
}
