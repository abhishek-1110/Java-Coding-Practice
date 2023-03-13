package TrainingClassesPractice._27thJuly;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 21, 5, 9, 8, 1, 7, 19};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            int j = i + 1;
            while (j < n) {
                if (arr[j] < arr[min])
                    min = j;
                j++;
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
