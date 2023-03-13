package TrainingClassesPractice._13thAugust;

public class Program1 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] cost = {10, 20};

//        System.out.println(magicStick(arr, cost, arr.length));
    }

    public static int magicStick(int[] arr, int[] cost, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            int ans = 0;
            for (int j = 0; j < n; j++) {
                ans += (val - arr[j]) * cost[i];
            }
            min = Math.min(ans, min);
        }
        return Math.abs(min);
    }
}
