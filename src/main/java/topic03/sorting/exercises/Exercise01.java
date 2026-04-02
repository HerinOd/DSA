package topic03.sorting.exercises;

import topic03.sorting.examples.SortAlgo;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an array a that stores n integers including some negative integers, some positive integers and one zero element.
We want to rearrange the array so that, every negative element goes to the left, following is the zero element and then all the positive elements.
Please write a Java program to solve this problem. Your program should:

- Ask user to input n, array a using the keyboard.

- Rearrange the array a.

- Show the result.
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for(int a = 0; a < arrayLength; a++){
            array[a] = input.nextInt();
        }
        SortAlgo sortingAlgorithm = new SortAlgo();
        sortingAlgorithm.mergeSort(array, 0, arrayLength - 1);
        System.out.println("Your sorted array: " + Arrays.toString(array));
    }
}
