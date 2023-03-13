package TrainingClassesPractice._27thJuly;

public class Frequency {
    public static void main(String[] args) {
        // it doesn't handle negative numbers
        int[] arr = {1, 1, 3, 4, 4, 8, 9, 9, 9};
        int[] nums = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            nums[arr[i]] = nums[arr[i]] + 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            System.out.print(i + " = " + nums[i]);
            System.out.println();
        }
    }
}