package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 5, 8, 9, 1, 0, 7, 6, 10};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean nextIteration = true;

        while (nextIteration) {
            nextIteration = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i-1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    nextIteration = true;
                }
            }
        }
        return arr;
    }
}
