package TrainingClassesPractice._14thAugust;

public class _2Program {
    public static void main(String[] args) {
        int[] arr = {11, 16, 82, 2, 13, 16, 64, 92, 100, 256};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                sum += arr[i];
            } else if (arr[i] % 2 == 0) {
                if (isPowerOfTwo(arr[i])) {
                   // System.out.println(arr[i]);
                    count++;
                    sum += arr[i];
                }
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }

    private static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }
}
