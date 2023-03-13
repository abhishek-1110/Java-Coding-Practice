package TrainingClassesPractice._30thJuly.OOPs;

public class oops1 {

    int fun(int n) {
        if (n <= 1) return 1;
        int ans = 1;
        for (int i = n - 1; i >= 1; i--) {
            ans *= i;
        }
        return n / ans;
    }

    public static void main(String[] args) {
        oops1 ops = new oops1();
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int ans = ops.fun(i);
            sum += ans;
        }
        System.out.println(sum);
    }
}