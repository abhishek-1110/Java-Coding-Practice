package TrainingClassesPractice._5thAugust;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {9, -3, 8, -6, -7, 8, 10};
//        int maxProduct = Integer.MIN_VALUE;
//        int sum = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int product = arr[i] * arr[j];
//                if (product >= maxProduct) {
//                    maxProduct = product;
//                    sum = arr[i] + arr[j];
//                }
//            }
//        }
//        System.out.println(sum);
        Arrays.sort(arr);
        int p1 = arr[0] * arr[1];
        int p2 = arr[arr.length - 1] * arr[arr.length - 2];
        if (p1 > p2) {
            System.out.println(arr[0] + arr[1]);
        } else {
            System.out.println(arr[arr.length - 1] + arr[arr.length - 2]);
        }

    }
}
