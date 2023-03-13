package TrainingClassesPractice._7thAugust;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {20, 12, 11, 43, 21, 22, 45, 89};
        System.out.println(linearSearch(0, arr, 45));
    }

    private static String linearSearch(int i, int[] arr, int x) {
        if (arr[i] == x) return "Element found at index: " + i;
        if (i == arr.length) {
            return "NOT FOUND";
        }
        return linearSearch(i + 1, arr, x);
    }
}
