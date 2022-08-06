package insertSort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 5, 8, 9, 1, 0, 7, 6, 10};
        System.out.println(Arrays.toString(insertSort(array)));
    }
    public static int[] insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i;

            while (j > 0 && arr[j-1] >= tmp) {
                arr[j] = arr[j-1];
                --j;
            }
            arr[j] = tmp;
        }
        return arr;
    }
}
