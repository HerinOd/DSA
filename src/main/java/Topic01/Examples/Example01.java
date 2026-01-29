package Topic01.Examples;

import java.util.Scanner;
import java.lang.String;

public class Example01 {
    /**
     * Constructor for objects of class Example01
     */
    public Example01() {

    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        int number1, number2, number3;
        System.out.println("Please input 3 integers!");
        System.out.println("The first one: ");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        System.out.println("The second one: ");
        number2 = scanner.nextInt();
        System.out.println("The third one: ");
        number3 = scanner.nextInt();
        System.out.println("The sum of three integers is: " + sum(number1,number2,number3));
        scanner.close();
    }
}