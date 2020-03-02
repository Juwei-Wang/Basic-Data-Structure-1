package course.lesson10.case04_dy;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 8, 4};
        System.out.println(max(arr, arr.length));
    }

    public static int max(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        /*
          arr_n                                         max
              \-- A: max     -->   arr_n             --/
               \- B: not     -->   max(arr, n -1)    -/
         */
        int solution1 = arr[n - 1];
        int solution2 = max(arr, n - 1);
        return Math.max(solution1, solution2);
    }
}
