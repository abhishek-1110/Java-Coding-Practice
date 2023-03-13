package TrainingClassesPractice.Array;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int p = 1;
        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = last;
            p++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
