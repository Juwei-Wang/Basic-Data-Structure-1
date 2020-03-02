package course.lesson10.case02_twoSum;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 8, 4};
        System.out.println(twoSum(arr, 10));
    }

    public static boolean twoSum(int[] arr, int k) {
        HashSet<Integer> integers = new HashSet<>();
        for (int value : arr) {
            integers.add(value);
        }

        for (int value : arr) {
            if (integers.contains(k - value)) {
                return true;
            }
        }

        return false;
    }
}
