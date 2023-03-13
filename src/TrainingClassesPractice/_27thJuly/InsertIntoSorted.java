package TrainingClassesPractice._27thJuly;

import java.util.Arrays;

public class InsertIntoSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = new int[arr.length + 1];
        int k = ans.length - 1;
        int elem = 2;
        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > elem) {
                ans[k--] = arr[i];
            } else {
                ans[k--] = elem;
                break;
            }
        }
        while (i != -1) {
            ans[k--] = arr[i--];
        }
        System.out.println(Arrays.toString(ans));
    }
}
