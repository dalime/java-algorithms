package linearsearch;

public class App {

	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0] = 10;
		intArr[1] = 13;
		intArr[2] = 16;
		intArr[3] = 19;
		intArr[4] = 21;
		
		int ans = linearSearch(intArr, 21);
		System.out.println("Answer: " + ans);
	}
	
	private static int linearSearch(int[] arr, int value) {
		
		for (int i = 0; i < arr.length; i++) { // For each index i going from 1 to n, in order
			if (arr[i] == value) { // if a[i] == x
				return i; // then set answer to the value of i
			}
		}
		
		return -1; // Return the value of answer as the output.
		// Set answer = 1
	}

}
