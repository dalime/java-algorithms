package mergesort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] array = mergeSort(new int[] {7,2,9,11,3,5,1}, 0, 6);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] mergeSort(int[] arr, int p, int r) {
		if (p < r) {
			int q = (int) Math.floor((p + r)/2);
			mergeSort(arr, p, q);
			mergeSort(arr, q + 1, r);
			merge(arr, p, q, r);
		}
		return arr;
	}
	
	public static int[] merge(int[] arr, int p, int q, int r) {
		int leftCount = q - p + 1;
		int rightCount = r - q;
		int[] leftArr = Arrays.copyOfRange(arr, 0, leftCount + 1);
		int[] rightArr = Arrays.copyOfRange(arr, 1, rightCount + 1);
		for (int i = 0; i < leftArr.length; i++) {
			leftArr[i] = arr[p + (i - 1)];
		}
		for (int j = 0; j < rightArr.length; j++) {
			rightArr[j] = arr[q + j];
		}
		leftArr[leftCount + 1] = (int) Double.POSITIVE_INFINITY;
		rightArr[rightCount + 1] = (int) Double.POSITIVE_INFINITY;
		int i = 0;
		int j = 0;
		for (int k = p; k < r; k++) {
			if (leftArr[i] > rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
		}
		return arr;
	}

}
