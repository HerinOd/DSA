package topic02.analysis_of_algorithms.examples;

import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to search: ");
        int n = input.nextInt();

        int[]  arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the element you want to search: ");
        int m = input.nextInt();
        System.out.println("The index of the element you want to search is: " + search(arr, n, m));
    }

    public static int search(int[] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                return i;
            }
        }
        return -1;
    }

}
