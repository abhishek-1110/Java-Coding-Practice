package TrainingClassesPractice.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 9, 11, 23, 22};
        int x = 21; // element to search is x
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index: " + i);
                System.exit(0);
            }
        }
        System.out.println("Element not found in given array.");
    }
}
