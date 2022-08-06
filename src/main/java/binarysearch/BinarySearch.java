package binarysearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 5));
    }
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid;
            } else  {
                start = mid;
            }
        }
        return -1;
    }
}
