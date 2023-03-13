package TrainingClassesPractice.Array;

import java.util.Arrays;

public class SwapAdjacentElements {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int i = 0;
        while (i < arr.length) {
            if (i >= arr.length - 1) break;
            swap(arr, i, i + 1);
            i += 2;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
