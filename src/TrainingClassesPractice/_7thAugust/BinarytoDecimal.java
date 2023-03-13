package TrainingClassesPractice._7thAugust;

public class BinarytoDecimal {
    public static void main(String[] args) {
        int binary = 11001;
        toDecimal(binary, 0);
        System.out.println(ans);
    }

    static int ans = 0;

    private static void toDecimal(int n, int power) {
        if (n == 0) return;
        else {
            int mod = n % 10;
            ans += mod * (int) Math.pow(2, power);
            toDecimal(n / 10, power + 1);
        }
        return;
    }
}
