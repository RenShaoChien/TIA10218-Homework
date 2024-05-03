package hw4;

import java.util.Arrays;

/**
 * ClassName： Array package：hw4 Description：
 *
 * @Author 任少騫
 * @Create 2024/5/1 @{TIME}
 * @Version 1.0
 */
public class Array {
	int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };;
	int sum;
	int arrAvg = sum / this.arr.length;
	int[] greater;

	public void getArraySum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
	}

	public void getArrayAvg(int[] arr) {
		arrAvg = sum / arr.length;
	}

	public void getGreaterThanAvg(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		int[] temp = new int[arr.length];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arrAvg < arr[i]) {
				temp[j++] = arr[i];
				count++;
			}
		}
		greater = new int[count];
		for (int i = 0; i < greater.length; i++) {
			greater[i] = temp[i];
		}
	}

	public void printGreaterArray() {
		for (int i = 0; i < greater.length; i++) {
			System.out.print(greater[i] + "  ");
		}
	}

	public static void main(java.lang.String[] args) {
		Array arr = new Array();
		arr.getArraySum(arr.arr);
		arr.getArrayAvg(arr.arr);
		arr.getGreaterThanAvg(arr.arr);
		System.out.println(arr.arrAvg);
		arr.printGreaterArray();
	}
}
