package TrainingClassesPractice.Practice;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 9, 7, 11, 12, 15};
        int[] ans = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
                ans[k++] = arr[i];
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(ans[i] + " ");
        }
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
