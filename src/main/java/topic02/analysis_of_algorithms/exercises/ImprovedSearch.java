package topic02.analysis_of_algorithms.exercises;

import java.util.Scanner;
//Improve the algorithm in SimpleSearch to get more time efficient algorithm?
public class ImprovedSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of your array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int search = scanner.nextInt();
        System.out.println("The index of the element you want to search is: " + binarySearch(array, search, 0, n - 1));
    }

    public static int binarySearch(int[] array, int search, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (array[mid] == search) {
            return mid;
        }

        if (array[mid] < search) {
            return binarySearch(array, search, mid + 1, high);
        } else  {
            return binarySearch(array, search, low, mid - 1);
        }
    }

}
