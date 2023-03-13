package TrainingClassesPractice._14thAugust;

import java.util.Arrays;

public class _3Program {
    public static void main(String[] args) {
        int n = 7;
        int k = 4;

        int[] arr = {21, 3, 4, 42, 67, 1, 9};
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                arr[i] = 10 - arr[i];
            } else {
                int x = arr[i] % 10;
                arr[i] = x;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
