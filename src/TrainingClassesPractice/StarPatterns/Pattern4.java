package TrainingClassesPractice.StarPatterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 7;
        int spaces = n - 1;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            if (spaces > i) {
                spaces = spaces - 1;
                stars = stars + 2;
            }
            if (spaces < i) {
                spaces = spaces + 1;
                stars = stars - 2;
            }
            System.out.println();
        }
    }
}
