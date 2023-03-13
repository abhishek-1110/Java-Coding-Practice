package TrainingClassesPractice;


public class Isomorphic {
    public static void main(String[] args) {
        int n = 9;
//        int count = getCount(n); // not in use
        int square = n * n;
        while (n != 0) {
            if (n % 10 != square % 10) {
                System.out.println("Not isomorphic");
                System.exit(0);
            }
            n /= 10;
            square /= 10;
        }
        System.out.println("Isomporphic");
    }

    private static int getCount(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}