package Topic01.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/* Write a program that asks user to input a list of N integers using the keyboard.
Then the program should sort the list in ascending order, and print out the result. */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of your array: ");
        int n = scanner.nextInt(); //array's length
        int[] array = new int[n];

        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            //vị trí chốt số bé nhất trong phần còn lại của mảng
            for (int j = i + 1; j < n; j++) {
                //tìm số bé nhất trong phần còn lại để chốt vào index i
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Your sorted array: " + Arrays.toString(array));
    }
}