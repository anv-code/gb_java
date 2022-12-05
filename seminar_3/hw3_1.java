// 1. Реализовать алгоритм сортировки слиянием

package seminar_3;

import java.util.Arrays;

public class hw3_1 {
    public static void main(String[] args) {
        int[] array = new int[] {7, 5, 1, 3, 4, 9, 0, 6, 8, 2};
        System.out.println(Arrays.toString(array));
        merge_sort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
    public static void merge_sort(int[] arr, int n) {

        if (n < 2) {
            return;
        }

        int middle = n / 2;
        int[] left = new int[middle];
        int[] right = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        for (int i = middle; i < n; i++) {
            right[i - middle] = arr[i];
        }

        merge_sort(left, middle);
        merge_sort(right, n - middle);
        merge(arr, left, right, middle, n - middle);
    }
    public static void merge(int[] arr, int[] left, int[] right, int l, int r) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < l) {
            arr[k++] = left[i++];
        }

        while (j < r) {
            arr[k++] = right[j++];
        }
    }
}
