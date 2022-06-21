package com.arraychallengeone;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		int[] intArray = getIntegers(5);
		insertionSortRecursive(intArray, 4);
		printArray(intArray);
	}

	public static void insertionSortRecursive(int arr[], int n) {
		if (n <= 1)
			return;

		insertionSortRecursive(arr, n - 1);

		int last = arr[n - 1];
		int j = n - 2;

		if (j >= 0 && arr[j] > last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;
	}

	public static int[] getIntegers(int arrayLength) {
		System.out.println("please enter your input:-");
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			System.out.println("input taken as " + array[i]);
		}
		return array;
	}
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}

