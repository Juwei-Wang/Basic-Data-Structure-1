package course.lesson08.case02_mergeSort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 8, 4, 2, 9, 1, 0, 5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        LinkedList<Integer> sorted = mergeSort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sorted.get(i);
        }
    }
    //  [0, 3)
    //  +   [0, 1)
    //  +   [1, 3)
    //      +   [1, 2)
    //      +   [2, 3)

    //  [0, 2)
    //  +   [0, 1)
    //  +   [1, 2)



    public static LinkedList<Integer> mergeSort(int[] arr, int i, int j) {

        // base case
        if (j - i == 1) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(arr[i]);
            return list;
        }

        // partition
        int mid = (i + j) / 2;

        // recursion
        LinkedList<Integer> queue1 = mergeSort(arr, i, mid);
        LinkedList<Integer> queue2 = mergeSort(arr, mid, j);


        // merge
        LinkedList<Integer> queue = new LinkedList<>();

        // addLast -> enqueue
        // removeFirst -> dequeue

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            if (queue1.getFirst() < queue2.getFirst()) {
                Integer min = queue1.removeFirst();
                queue.addLast(min);
            } else {
                Integer min = queue2.removeFirst();
                queue.addLast(min);
            }
        }

        while (!queue1.isEmpty()) {
            Integer min = queue1.removeFirst();
            queue.addLast(min);
        }

        while (!queue2.isEmpty()) {
            Integer min = queue2.removeFirst();
            queue.addLast(min);
        }

        return queue;
    }
}

//
//

//   1 2 4 7
