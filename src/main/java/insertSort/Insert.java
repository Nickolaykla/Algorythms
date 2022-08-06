package insertSort;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
      int[] arr = {3, 1, 2, 5, 4};
        System.out.println(Arrays.toString(insertSort(arr)));
    }
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j = i;

            while (j > 0 && arr[j-1] > min) {
                arr[j] = arr[j-1];
                --j;
            }
            arr[j] = min;
        }
        return arr;
    }
}
