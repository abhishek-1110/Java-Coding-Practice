package TrainingClassesPractice._27thJuly;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DupilcateElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 4, 8, 9, 9, 9};
        int[] nums = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            nums[arr[i]] = nums[arr[i]] + 1;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 1) {
                count += nums[i];
            }
        }
        System.out.println(count);
    }
}
