package TrainingClassesPractice.PracticeQestions;

import java.util.Scanner;

public class ArrayBound {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        Scanner scn = new Scanner(System.in);
        int index = scn.nextInt();
        try {
            if (index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Out Of Bounds");
            } else {
                System.out.println(arr[index]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
