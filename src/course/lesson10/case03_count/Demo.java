package course.lesson10.case03_count;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2, 3, 4, 5, 2, 1};
        count(arr);
    }

    public static void count(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int element : arr) {
            // no key -> put key 1
            // key -> key.value++

            if (count.containsKey(element)) {
                int currentCount = count.get(element);
                count.put(element, currentCount + 1);
            } else {
                count.put(element, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = count.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue() );
        }
    }
}

// 10 1 11 1 10
// 10 11 10 11 10