package coding_practice.exercise03;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println(love6(6,4));
        System.out.println(love6(4,5));
        System.out.println(love6(1,5));
    }
    public static boolean love6(int a, int b) {
        if ((a == 6) || (b == 6)) {
            return true;
        } else if ((Math.abs(a - b) == 6) || ((a + b == 6))) {
            return true;
        } else {
            return false;
        }
    }
}
