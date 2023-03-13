package TrainingClassesPractice._5thAugust;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 10, 4, 3, 2, 11};
        int start = 2;
        int end = 5;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
