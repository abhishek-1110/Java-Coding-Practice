package TrainingClassesPractice;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 10; i <= 100; i++) {
            int rev = 0;
            int num = i;
            while (num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num /= 10;
            }
            if (i == rev) {
                System.out.print(i + " ");
            }
        }
    }
}
