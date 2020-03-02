package course.lesson05.case02_recursion;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 8, 4};
        System.out.println(arrayMax(arr, arr.length));
    }

    public static int arrayMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int max = arrayMax(arr, n - 1);
        int last = arr[n - 1];
        return Math.max(max, last);
    }
}
