package course.lesson07.case01_binarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 11, 32, 79, 102, 123};
        System.out.println(binarySearch(arr, 6));
    }

    public static boolean binarySearch(int[] arr, int query) {
        //
        return binarySearch(arr, 0, arr.length, query);
    }

                                        //            i <= , < j
    public static boolean binarySearch(int[] arr, int i, int j, int query) {

        int midIndex = (i + j) / 2;
        // a b c d e f g h
        //         ^
        // a b c d e f g h i
        //         ^

        int mid = arr[midIndex];

        // 1 2 3 4 5 6 7 8 9
        // i       m         j

        if (mid < query) {
            return binarySearch(arr, mid + 1, j, query);
        } else if (mid > query) {
            return binarySearch(arr, i, mid, query);
        } else {
            return true;
        }
    }

}
