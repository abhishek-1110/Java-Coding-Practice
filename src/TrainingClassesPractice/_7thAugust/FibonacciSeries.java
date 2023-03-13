package TrainingClassesPractice._7thAugust;

public class FibonacciSeries {

    public static void main(String[] args) {
        // base conditions
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        helper(0, 1, 10);
    }

    public static void helper(int a, int b, int length) {
        if (length == 1) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        helper(b, c, length - 1);

    }
}
