package TrainingClassesPractice._9thAugust;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            if (c <= 0) {
                throw new Exception("value of c is smaller than or equal to " + c);
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
