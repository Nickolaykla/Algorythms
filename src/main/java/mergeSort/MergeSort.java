package mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 5, 8, 9, 1, 0, 7, 6, 10};
        mergeSort(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] arr, int arrLength) {
        if (arrLength < 2) return;

        int mid = arrLength / 2;
        int[] leftSide = new int[mid];
        int[] rightSide = new int[arrLength - mid];

        for (int i = 0; i < mid; i++) {
            leftSide[i] = arr[i];
        }
        for (int i = mid; i < arrLength; i++) {
            rightSide[i - mid] = arr[i];
        }
        mergeSort(leftSide, mid);
        mergeSort(rightSide, arrLength - mid);

        merge(arr, leftSide, rightSide, mid, arrLength - mid);
    }

    public static void merge(
            int[] arr, int[] leftSide, int[] rightSide, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftSide[i] <= rightSide[j]) {
                arr[k++] = leftSide[i++];
            } else {
                arr[k++] = rightSide[j++];
            }
        }
        while (i < left) {
            arr[k++] = leftSide[i++];
        }
        while (j < right) {
            arr[k++] = rightSide[j++];
        }
    }
}
