package TrainingClassesPractice._5thAugust;

public class NumberConcatenation {
    public static void main(String[] args) {
        int a = 1234;
        int b = 5678;
        int c = 1234;

        int ans = 0;
        int var = 1000;
        boolean flag = true;
        while (var > 0) {
            int q1 = a / var;
            a %= var;
            int q2 = b / var;
            b %= var;
            int q3 = c / var;
            c %= var;
            var /= 10;

            if (flag) {
                ans += Math.min(q1, Math.min(q2, q3));
                //System.out.println(ans);
                flag = false;
            } else {
                ans += Math.max(q1, Math.max(q2, q3));
                //System.out.println(ans);
                flag = true;
            }
            ans *= 10;
        }
        System.out.println(ans / 10);
    }
}
