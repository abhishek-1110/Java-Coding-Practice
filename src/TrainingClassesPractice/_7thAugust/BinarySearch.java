package TrainingClassesPractice._7thAugust;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int ans = binarySearch(arr, 0, arr.length - 1, 5);
        if (ans == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + ans);
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int x) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;

        if (arr[mid] == x) {
            return mid;
        } else if (x > arr[mid]) {
            return binarySearch(arr, low + 1, high, x);
        } else {
            return binarySearch(arr, low, high - 1, x);
        }
    }
}