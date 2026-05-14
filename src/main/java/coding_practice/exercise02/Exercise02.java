package coding_practice.exercise02;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println(nearTen(12));
        System.out.println(nearTen(17));
        System.out.println(nearTen(19));
    }
    public static boolean nearTen(int num) {
        int remainder = num % 10;
        return (remainder <= 2 || remainder >= 8);
    }
}
