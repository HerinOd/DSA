package Topic01.Exercises;

import java.util.Scanner;

/* Write a program that asks user to input a name (a string may contain characters and spaces) using the keyboard.
 Then the program should print out how many characters that the name has (exclusive the spaces). */
public class Exercise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int characterCount = 0;

        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);

            if (character != ' ')
                characterCount++;
        }

        System.out.println("\nNumber of characters in your name: " + characterCount);

    }
}