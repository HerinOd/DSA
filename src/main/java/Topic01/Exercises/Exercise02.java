package Topic01.Exercises;

import java.util.Scanner;
/* Write a program that asks user to input a list of N integers using the keyboard.
Then the program should print out the maximum integer of the list. */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of your array: ");
        int arraylength = scanner.nextInt();
        int[] array = new int[arraylength];

        System.out.println("Enter your numbers: ");
        for (int i = 0; i < arraylength; i++) {
            array[i] = scanner.nextInt();
        }

        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber)
                maxNumber = array[i];
        }

        System.out.println("The maximum number is: " + maxNumber);
    }
}