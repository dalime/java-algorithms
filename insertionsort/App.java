package insertionsort;

public class App {

	public static void main(String[] args) {
		int[] array = insertionSort(new int[] {3, 54, 23, 63, 12, 82, 4});
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int element = arr[i]; // element variable contains data we intend on bringing over to sorted area
			int j = i - 1; // j always pointing to last index position of the last value in sorted area
			while (j >= 0 && arr[j] > element) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = element;
		}
		return arr;
	}
	
	// [][][][][]|[][][][][][][]
	// { sorted } {  unsorted  }

}
