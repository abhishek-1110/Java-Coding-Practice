package TrainingClassesPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

class CreateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Elements are: " + Arrays.toString(arr));
    }
}