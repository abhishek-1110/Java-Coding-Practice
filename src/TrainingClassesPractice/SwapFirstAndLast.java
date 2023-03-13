package TrainingClassesPractice;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        int num = 12341;
        int t = num, count = 0;
        int last = num % 10;
        while (num > 10) { // for getting first no. num > 10
            num /= 10;
            count++;
        }
        t /= 10;
        int p = (int) Math.pow(10, count - 1);
        int ans = (last - 1) * p;
        ans += t;
        ans = ans * 10 + num;
        System.out.println(ans);
    }
}
