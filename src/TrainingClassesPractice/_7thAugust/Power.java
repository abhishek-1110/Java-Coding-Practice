package TrainingClassesPractice._7thAugust;

public class Power {
    public static void main(String[] args) {
        int num = 10;
        int power = 2;
        int ans = power(num, power);
        System.out.println(ans);
    }

    public static int power(int num, int pow) {
        if (pow == 0) return 1;
        return num * power(num, pow - 1);
    }
}
