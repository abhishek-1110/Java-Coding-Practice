package TrainingClassesPractice;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        int original = n;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans += getFactorial(rem);
            n /= 10;
        }
        if (ans == original) {
            System.out.println("Given no. is a strong number.");
        } else {
            System.out.println("Not a strong number.");
        }
    }
    private static int getFactorial(int n) {
        if (n == 0) return 1;
        int ans = 1;
        for (int i = n; i >= 1; i--) {
            ans *= i;
        }
        return ans;
    }
}
