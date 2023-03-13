package TrainingClassesPractice;

public class HCF {
    public static void main(String[] args) {
        int a = 25, b = 7;
        int small = a > b ? b : a;
        if (a % small == 0 && b % small == 0) {
            System.out.println(small);
            System.exit(0);
        }
        for (int i = small / 2; i >= 2; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(1);
    }
}
