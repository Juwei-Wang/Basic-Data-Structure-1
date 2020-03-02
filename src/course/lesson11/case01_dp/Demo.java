package course.lesson11.case01_dp;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        int[] coins = {20, 10, 20, 50, 20, 10, 20, 20, 10, 20, 50, 20, 10, 20, 20, 10, 20, 50, 20, 10, 20, 20, 10, 20, 50, 20, 10, 20, 20, 10, 20, 50, 20, 10, 20, 20, 10, 20, 50, 20, 10, 20, 20, 10};
        long ts1 = System.currentTimeMillis();
        System.out.println(select(coins, coins.length));
        long ts2 = System.currentTimeMillis();
        System.out.println((ts2 - ts1) / 1000.0);
    }

    private static Map<Integer, Integer> solutions
        = new HashMap<>();

    public static int select(int[] coins, int n) {
        // check 是否已经解决过这个问题了
        if (solutions.containsKey(n)) {
            return solutions.get(n);
        }

        if (n <= 0) {
            return 0;
        }

        int solution1 = coins[n - 1] + select(coins, n - 2);
        int solution2 = select(coins, n - 1);
        int solution = Math.max(solution1, solution2);

        // memorize
        solutions.put(n, solution);

        return solution;
    }

    //  T(n) = T(n - 1) + T(n - 2) + c
    //                    O(1)
    //

    //  7
    //  +   6
    //      +   5
    //          +   4
    //
    //                      1
    //                      +   0
    //                      +   -1
    //          +   3
    //      +   4
    //  +   5

    // O(7)
}
