package TrainingClassesPractice._11thAugust.Infosys_2019;

public class Program3 {
    public static void main(String[] args) {
        int n = 195;
        reverse(n);
    }

    private static boolean checkPalindrome(int n) {
        int rev = 0;
        int original = n;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return original == rev;
    }

    public static void reverse(int n) {
        int rev = 0;
        int original = n;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        int sum = rev + original;
        if (checkPalindrome(sum)) {
            System.out.println(sum);
            return;
        } else {
            reverse(sum);
            return;
        }
    }
}
