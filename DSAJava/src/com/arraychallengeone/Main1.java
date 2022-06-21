package com.arraychallengeone;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
        int[] intArray = getIntegers(5);

        mergeSort(intArray, 0, intArray.length);
        printArray(intArray);
       
    }

    private static void printArray(int[] intArray) {
    	 for (int i = 0; i < intArray.length; i++) {
             System.out.println(intArray[i]);
         }
		
	}

	public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {//because one element array is already sorted
            return;
        }

        int mid = (start + end) / 2;//array partition hai
        mergeSort(input, start, mid);//right array 0 se index
        mergeSort(input, mid, end);//left array index se array.length
        merge(input, start, mid, end);//merge left aur right array
    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] >= input[mid]) {	//only sorted array will be merged
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;// our location in temporary array

        int[] temp = new int[end - start];
        if (i < mid && j < end) {//compare indexes in arrays and save the smaller in temp[]
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];// i and j's comparison decides ascendind or decending
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);//putting remaining elements in the left array into temp
        System.arraycopy(temp, 0, input, start, tempIndex);//right array doesnt need to be put because it is totally traversed

    }
    public static int[] getIntegers(int arrayLength) {
		System.out.println("please enter your input:-");
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			System.out.println( "input taken as "+array[i]);
		}
		return array;
	}

}
