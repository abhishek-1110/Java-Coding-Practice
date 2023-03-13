package TrainingClassesPractice._28thJuly;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 20, 19};
        int first = arr[0];
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (first == arr[i]) continue;
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else {
//                second = Math.max(second, arr[i]);
                if (arr[i] > second) {
                    second = arr[i];
                }
            }
        }
        System.out.println(second);
    }
}
