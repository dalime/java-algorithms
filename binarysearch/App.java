package binarysearch;

public class App {

	public static void main(String[] args) {
		System.out.println("Answer is: " + recursiveBinarySearch(new int[] {10,30,50,70,90,110,130,150}, 0, 7, 30));		
	}
	
	private static int binarySearch(int[] arr, int value) { // Procedure BINARY-SEARCH(a,x):
		int p = 0; // Inputs and Outputs same as LINEAR-SEARCH
		int r = arr.length; // 1) Set p to 0, and set r to n.
		while (p <= r) { // 2) While p <= r, do the following:
			int q = (int) Math.floor((p + r)/2); // A. Set q to [ (p + r)/2 ]
			if (arr[q] > value) r = q - 1; // B. if q > value set r = q - 1
			else if (arr[q] < value) p = q + 1; // C. if q < value set p = q + 1
			else return q; // D. Return value of q
		}
		return -1; // 3) Return - 1
	}
	
	public static int recursiveBinarySearch(int[] arr, int p, int r, int value) {
		if (p > r) return -1;
		else {
			int q = (int) Math.floor((p + r)/2);
			if (arr[q] == value) return q;
			else if (arr[q] > value) return recursiveBinarySearch(arr, p, q - 1, value);
			else return recursiveBinarySearch(arr, q + 1, r, value);
		}
	}
	
	int i = binarySearch(new int[] {0,2,4,6}, 4);

}
