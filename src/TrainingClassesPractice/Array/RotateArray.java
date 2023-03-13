package TrainingClassesPractice.Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {11, 22, 33, 44, 55};
        int n = nums.length;
        int k = 2;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    /*
    one approach is to change the postiion of element by one..

    for (int j = 0; j < 3; j++) {
        int t = arr[0];
            for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = t;
    }
     */
    /*
        H.W = Rotate from left
     */
}
