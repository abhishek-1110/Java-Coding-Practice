package TrainingClassesPractice._28thJuly;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        Scanner scn = new Scanner(System.in);
        int pos = 1;
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        System.out.println(ls);
        ls.remove(1);
        System.out.println(ls);
    }
}
