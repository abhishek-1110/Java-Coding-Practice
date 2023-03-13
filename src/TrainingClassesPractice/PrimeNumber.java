package TrainingClassesPractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = scn.nextInt();
        // to check prime nos. between 20 and 100
        for (int i = 50; i <= 100; i++) {
            if (checkPrime(i))
                System.out.print(i + " ");
        }
    }
    private static boolean checkPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // prime no. method
    public static void method2(int n) {
        int i;
        for (i = 2; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("Not a prime number");
                break;
            }
        }
        if (i == 7) {
            System.out.println("Prime number..");
        }
    }
}