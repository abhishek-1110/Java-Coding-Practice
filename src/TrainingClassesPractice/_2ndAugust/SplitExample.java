package TrainingClassesPractice._2ndAugust;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str = "Hello how are you";
        String[] arr = str.split("\\s+");
        System.out.println(Arrays.toString(arr));
        String g = "";
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            for (int j = s.length() - 1; j >= 0; j--) {
                g = g + s.charAt(j);
            }
            g = g + " ";
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            String a = arr[i];
            System.out.print(a + " ");
        }
        System.out.println(g.trim());
    }
}
