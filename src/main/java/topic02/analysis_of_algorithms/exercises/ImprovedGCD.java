package topic02.analysis_of_algorithms.exercises;

import java.util.Scanner;
//Improve the algorithm in SimpleGCD to get more time efficient algorithm?
public class ImprovedGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers m and n (m > n): ");
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.printf("The value of gcd(%d, %d) is (recursion) %d", m, n, recursiveGCD(m, n));
        System.out.printf("\nThe value of gcd(%d, %d) is (while loop) %d", m, n, whileLoopGCD(m, n));
    }

    public static int recursiveGCD(int m, int n) {
        if (m % n == 0) {
            return n;
        }

        return recursiveGCD(n, m % n);
    }

    public static int whileLoopGCD(int m, int n) {
        while (m % n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return n;
    }

}