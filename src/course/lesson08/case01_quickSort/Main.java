package course.lesson08.case01_quickSort;


public class Main {
    public static void main(String[] args) {

    }

    public static void quickSort(int[] arr, int k) {
        quickSort(arr, 0, arr.length, k);
    }
    public static void quickSort(int[] arr, int i, int j, int k) {
        if (i == j) {
            return;
        }
        int pivotIndex = partition(arr);
        quickSort(arr, pivotIndex + 1, j, k);
        quickSort(arr, i, pivotIndex, k);
    }

    public static int partition(int[] arr) {
        return 1;
    }
}
