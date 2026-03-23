package topic02.analysis_of_algorithms.examples;

import java.util.Scanner;

public class SimplePolyEvaluate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers, an integer n which is the length of the C array that stores the coefficients \n" +
                "of the polynomial and a real value X");
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter array C:");
        double[] c = new double[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextDouble();
        }

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        System.out.println("The value of f(x): " + polyEvaluate(c, n, x));
    }

    public static double polyEvaluate(double[] c, int n, double x) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double p = 1;
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    p *= x;
                }
            }
            sum += c[i] * p;
        }
        return sum;
    }

}
