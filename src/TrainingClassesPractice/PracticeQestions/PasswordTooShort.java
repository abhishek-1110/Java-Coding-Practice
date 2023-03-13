package TrainingClassesPractice.PracticeQestions;

import java.util.Scanner;

public class PasswordTooShort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String password = scn.next();
        // for password length
        try {
            if (password.length() < 6) {
                throw new Exception("Too Short!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        // for containing a digit
        int count = 0;
        try {
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= '1' && password.charAt(i) <= '9') {
                    count++;
                }
            }
            if (count == 0) {
                throw new Exception("No digit!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (count != 0 && password.length() > 6) {
            System.out.println("Correct");
        }
    }
}
