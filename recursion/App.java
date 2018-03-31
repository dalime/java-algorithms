package recursion;

public class App {

	public static void main(String[] args) {
		reduceByOne(10);
		
		System.out.println("Result is: " + recursiveLinearSearch(new int[] {9,7,5,3,1}, 0, 1));
	}
	
	public static void reduceByOne(int n) {
		if (n >= 0) {
			reduceByOne(n - 1);
		}	
		
		System.out.println("Completed Call: " + n);
	}
	
	public static int recursiveLinearSearch(int[] array, int i, int x) {
		if (i > array.length) return -1;
		else if (array[i] == x) return i;
		else return recursiveLinearSearch(array, i + 1, x);
	}

}
