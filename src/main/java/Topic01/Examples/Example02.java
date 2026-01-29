package Topic01.Examples;

import java.util.Random;
import java.util.Scanner;

public class Example02 {
    /**
     * Constructor for objects of class Example02
     */
    public Example02() {

    }

    public static void main(String[]args) {
        int n;
        int []a;
        a = new int[1000];

        System.out.println("Please input the integer N:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        Random rand = new Random();
        for (int i=0; i<n; i++) {
            a[i] = rand.nextInt(100);
        }

        System.out.println("The list of " + n + " integers is:");
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        scanner.close();
    }
}