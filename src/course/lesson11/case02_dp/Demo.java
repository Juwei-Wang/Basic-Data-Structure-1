package course.lesson11.case02_dp;

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

    private static int[] solutions;

    private static int getSolution(int i) {
        return i < 0 ? 0 : solutions[i];
    }

    public static int select(int[] coins, int n) {
        // 0
        solutions = new int[coins.length];

        for (int i = 0; i < n; i++) {
            // i = 0, -> n = 1
            // i = 1, -> n = 2
            int solution1 = coins[i] + getSolution(i - 2);
            int solution2 = getSolution(i - 1);
            int solution = Math.max(solution1, solution2);

            solutions[i] = solution;
        }

        return solutions[n - 1];
    }

}
