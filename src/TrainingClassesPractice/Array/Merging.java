package TrainingClassesPractice.Array;

import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {10, 11, 21, 22, 34};
        int[] arr = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr[k++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[k++] = arr2[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
        // for second loop
        arr[i + arr1.length] = arr2[i];
     */
}
