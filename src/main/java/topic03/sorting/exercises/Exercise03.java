package topic03.sorting.exercises;

import java.util.Scanner;
/*
Design an algorithm with the time complexity O(n) to solve the problem in Exercise 1.
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for(int a = 0; a < arrayLength; a++) {
            array[a] = input.nextInt();
        }

    }
    public static void improvedSort(int[] array) {
        // O(n)
        int negative = 0;
        int positive = array.length - 1;
        while (negative < positive) {
            while(array[negative] < 0) {
                negative++;
            }
            while(array[positive] > 0) {
                positive--;
            }
            if (negative <  positive) {
                int temp = array[negative];
                array[negative] = array[positive];
                array[positive] = temp;
                negative++;
                positive--;
            }
        }
    }
}
