package TrainingClassesPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = scn.nextInt();
//        int ans = 1;
//        if (n == 0 || n == 1) System.out.println("Factorial of " + n + " is: " + 1);
//        for (int i = n; i >= 1; i--) {
//            ans *= i;
//        }
//        System.out.println("Factorial of " + n + " is: " + ans);

        // to get factorial from 3 to 7
        for (int i = 3; i <= 7; i++) {
            System.out.println("Factorial of " + i + " is " + factorial(i));
        }
    }

    public static int factorial(int n) {
        int ans = 1;
        for (int i = n; i >= 1; i--) {
            ans *= i;
        }
        return ans;
    }
}