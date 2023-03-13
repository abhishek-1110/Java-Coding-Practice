package TrainingClassesPractice.Practice;


public class Question2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 14, 18, 51, 52, 56, 57};
        int[] ans = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = getSum(arr[i]);
            if (checkPrime(sum)) {
                ans[k++] = arr[i];
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int getSum(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }

    public static boolean checkPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
