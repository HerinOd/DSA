package topic02.analysis_of_algorithms.examples;

import java.util.Scanner;

public class SimplePow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number and an integer: ");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println("X to the power of N is: " + recPow(x,n));
        System.out.println("X to the power of N is: " + pow(x,n));
    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double s = 1;
        for (int i = 1; i <= n; i++) {
            s *= x;
        }
        return s;
    }

    public static double recPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * recPow(x, n - 1);
    }
}

