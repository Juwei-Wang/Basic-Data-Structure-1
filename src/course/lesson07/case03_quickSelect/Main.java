package course.lesson07.case03_quickSelect;

public class Main {
    public static void main(String[] args) {

    }

    public static int quickSelect(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length, k);
    }
    public static int quickSelect(int[] arr, int i, int j, int k) {
        //


        int pivotIndex = partition(arr);

        if (pivotIndex < k) {
            return quickSelect(arr, pivotIndex + 1, j, k);
        } else if (pivotIndex > k) {
            return quickSelect(arr, i, pivotIndex, k);
        } else {
            return arr[pivotIndex];
        }
    }

    public static int partition(int[] arr) {
        return 1;
    }
}
