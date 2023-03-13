package TrainingClassesPractice._28thJuly;

public class UniqueElements {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 4, 5, 6, 8, 9};
//        int[] nums = new int[1000];
//        for (int i = 0; i < arr.length; i++) {
//            nums[arr[i]] = nums[arr[i]] + 1;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                System.out.print(i + " ");
//            }
//        }
        method1();
    }

    public static void method1() {
        int[] arr = {2, 3, 2, 5, 2, 3, 6, 2};
        for (int i = 0; i < arr.length; i++) {
            int j;
            int count = 0;
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
