package TrainingClassesPractice._7thAugust;

public class ReverseANumberusingRecursion {
    public static void main(String[] args) {
        int a = 189;
        helper(a);
        System.out.println(ans);
    }

    static int ans = 0;

    public static void helper(int a) {
        if (a == 0) return;
        else {
            ans = ans * 10 + a % 10;
            helper(a / 10);
        }
    }
}
