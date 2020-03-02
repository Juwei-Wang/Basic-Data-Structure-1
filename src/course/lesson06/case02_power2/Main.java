package course.lesson06.case02_power2;

public class Main {
    public static void main(String[] args) {
        System.out.println(power2(10));
    }

    public static int power2(int n) {
        // base case
        if (n == 1) {
            return 2;
        }

        // recursion
        if (n % 2 == 0) {
            return power2(n/2) * power2(n/2);
        } else {
            return power2(n/2) * power2(n/2) * 2;
        }
    }
}
