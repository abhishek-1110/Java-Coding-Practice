package TrainingClassesPractice.Array;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 2, 4, 8, 12, 89, 88, 21};

        // for getting odd and even no. count
        int odd = 0, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }

        // odd Array
        int[] oddArr = new int[odd];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArr[k++] = arr[i];
            }
        }

        // even Array
        int[] evenArr = new int[even];
        k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[k++] = arr[i];
            }
        }

        System.out.println("Odd Array: " + Arrays.toString(oddArr));
        System.out.println("Even Array: " + Arrays.toString(evenArr));
    }
}
