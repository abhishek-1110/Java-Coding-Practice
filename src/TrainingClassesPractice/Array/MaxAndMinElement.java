package TrainingClassesPractice.Array;

import java.util.Scanner;

// find minimum and maximum element in an array

public class MaxAndMinElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);

    }
}
