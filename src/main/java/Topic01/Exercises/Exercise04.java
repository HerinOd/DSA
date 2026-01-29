package Topic01.Exercises;

import java.util.Scanner;
/* Write a program that asks user to input a list of N names using the keyboard, then user will input a name for searching.
The program should print out the position of this name in the list. In case the name doesn’t appear in the list, the program should print out value -1. */
public class Exercise04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of your name array: ");
        int n = scanner.nextInt(); scanner.nextLine();
        //array's length

        String[] names = new String[n];

        System.out.println("Enter each name: ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.print("Search name: ");
        String searchName = scanner.nextLine();
        int position = -1;
        //vị trí tên cần tìm

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                position = i;
                break;
            }
        }

        if (position == -1)
            System.out.println("Can't find " + searchName);
        else
            System.out.println("The index of " + searchName + " is: " + position);
    }
}