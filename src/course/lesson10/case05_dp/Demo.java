package course.lesson10.case05_dp;

public class Demo {
    public static void main(String[] args) {
        int[] coins = {20, 10, 20, 50, 20, 10, 20};
        System.out.println(select(coins, coins.length));
    }

    public static int select(int[] coins, int n) {
        if (n <= 0) {
            return 0;
        }
                       // 20, 10, 20, 50, 20, 10, 20
                       //                         ^?
        int solution1 = coins[n - 1] + select(coins, n - 2);
        int solution2 = select(coins, n - 1);
        return Math.max(solution1, solution2);
    }

    // T(n) = T(n - 1) + T(n - 2) + c
    //

    // T(7) = T(6) + T(5)
    //

    // T(7)
    //  +   6
    //      +   5
    //          +   4
    //              +   3
    //              +   2
    //          +   3
    //      +   4
    //          +   3
    //          +   2
    //  +   5
}
