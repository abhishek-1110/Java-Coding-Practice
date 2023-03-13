package TrainingClassesPractice._28thJuly;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 9, 11, 23, 22};
        int x = 21;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                System.out.println("Element is found at index: " + mid);
                System.exit(0);
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found.");
    }
}
