package topic02.analysis_of_algorithms.exercises;

import java.util.Scanner;
//Improve the algorithm in SimplePow or RecPow to get more time efficient algorithm?
public class ImprovedPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number and an integer: ");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println("X to the power of N is: " + pow(x,n));
    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        }  else {
            return half * half * x;
        }
    }

}
