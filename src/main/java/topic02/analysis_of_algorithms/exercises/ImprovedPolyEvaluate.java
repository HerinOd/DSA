package topic02.analysis_of_algorithms.exercises;

import java.util.Scanner;
//Improve the algorithm in SimplePolyEvaluate to get more time efficient algorithm?
public class ImprovedPolyEvaluate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers, an integer n which is the length of the C array that stores the coefficients \n" +
                "of the polynomial and a real value X");
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Enter array C:");
        double[] c = new double[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextDouble();
        }

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        System.out.println("The value of f(x): " + polyEvaluate(c, n, x));
    }

    public static double polyEvaluate(double[] c, int n, double x) {
        double sum = c[n - 1];
        for (int i = (n - 2); i >= 0; i--) {
            sum = sum * x + c[i];
        }
        return sum;
    }

}
