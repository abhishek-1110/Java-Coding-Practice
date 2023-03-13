package TrainingClassesPractice;

public class Armstrong {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int noOfDigits = getDigits(i);
            if (getArmStrong(i, noOfDigits)) {
                System.out.print(i + " ");
            }
        }
    }
    private static int getDigits(int i) {
        int count = 0;
        while (i != 0) {
            count++;
            i /= 10;
        }
        return count;
    }
    public static boolean getArmStrong(int num, int power) {
        int original = num;
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans = ans + (int) Math.pow(rem, power);
            num /= 10;
        }
        if (original == ans)
            return true;
       return false;
    }
}
