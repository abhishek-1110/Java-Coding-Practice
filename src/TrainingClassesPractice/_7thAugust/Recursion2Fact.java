package TrainingClassesPractice._7thAugust;

public class Recursion2Fact {
    public static void main(String[] args) {
        int a = 5;
        int ans = factorial(a);
        System.out.println(ans);
    }

    private static int factorial(int a) {
        if (a <= 1) return 1;
        return a * factorial(a - 1);
    }
}
