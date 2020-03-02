package course.lesson11.case03_cut;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        int[][] prices = {
            {1, 1},
            {2, 5},
            {3, 8},
            {4, 10},
            {5, 12}
        };
        long ts1 = System.currentTimeMillis();
        System.out.println(cut(prices, 20));
        long ts2 = System.currentTimeMillis();
        System.out.println((ts2 - ts1) / 1000.0);
    }

    public static int cut(int[][] prices, int n) {
        Demo.prices = new HashMap<>();
        for (int[] price : prices) {
            // [1, 1]       1 -> 1
            // [2, 5]       2 -> 5
            // [3, 8]       3 -> 8
            Demo.prices.put(price[0], price[1]);
        }

        solutions = new HashMap<>();
        return cut(n);
    }

    private static Map<Integer, Integer> prices;

    private static Map<Integer, Integer> solutions;

    public static int cut(int n) {
        // check
        if (solutions.containsKey(n)) {
            return solutions.get(n);
        }

        // base case
        if (n == 0) {
            return 0;
        }

        // recursion

//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        LinkedList<Integer> proposals = new LinkedList<>();

        Set<Integer> lengths = prices.keySet();
        for (Integer length : lengths) {
            if (n < length) {
                continue;
            }
            //
            int proposal = prices.get(length) + cut(n - length);
            proposals.add(proposal);
        }


        int max = 0;
        for (Integer proposal : proposals) {
            if (proposal > max) {
                max = proposal;
            }
        }
//        proposals.stream().mapToInt(Integer::intValue).max();


        // memorize
        solutions.put(n, max);

        return max;
    }
}
