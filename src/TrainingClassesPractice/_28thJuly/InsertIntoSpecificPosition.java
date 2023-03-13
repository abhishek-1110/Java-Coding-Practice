package TrainingClassesPractice._28thJuly;

import java.util.Arrays;
import java.util.Scanner;

public class InsertIntoSpecificPosition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scn.nextInt();
        int[] arr = new int[size + 1];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter the element to be inserted: ");
        int item = scn.nextInt();
        System.out.print("Enter the position where you want to insert: ");
        int pos = scn.nextInt();
        for (int i = size; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = item;
        System.out.println(Arrays.toString(arr));
    }
}
