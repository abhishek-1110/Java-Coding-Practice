package TrainingClassesPractice.PracticeQestions;

public class power {
    public static void main(String[] args) {
        int n = 17;
        if (powerOfTwo(n)) {
            System.out.println(true);
        } else if (powerOfThree(n)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static boolean powerOfThree(int n) {
        if (n <= 0)
            return false;
        if (n % 3 == 0)
            return powerOfThree(n / 3);
        if (n == 1)
            return true;
        return false;
    }

    private static boolean powerOfTwo(int n) {
        if (n == 0)
            return false;

        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
}
