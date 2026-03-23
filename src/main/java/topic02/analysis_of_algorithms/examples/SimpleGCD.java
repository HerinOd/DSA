package topic02.analysis_of_algorithms.examples;

import java.util.Scanner;

public class SimpleGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers m and n (m > n): ");
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.printf("The value of gcd(%d, %d) is %d", m, n, gcd(m, n));
    }

    public static int gcd(int m, int n) {
        for (int i = n; i > 1; i--) {
            if ((n % i == 0) && (m % i == 0)) {
                return i;
            }
        }
        return 1;
    }

}
