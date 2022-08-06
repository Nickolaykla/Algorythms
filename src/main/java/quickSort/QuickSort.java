package quickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 1, 0, 9, 5, 7, 6, 3, 10};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (arr.length == 0) return;

        if (start >= end) return;

        int mid = (start + end) / 2;
        int midElem = arr[mid];

        int i = start;
        int j = end;

        while (i <= j) {
            while (arr[i] < midElem) {
                i++;
            }

            while (arr[j] > midElem) {
                j--;
            }

            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        if (start < j)
            quickSort(arr, start, j);

        if (end > i)
            quickSort(arr, i, end);

    }
}
