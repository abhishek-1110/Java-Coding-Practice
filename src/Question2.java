import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scn.nextInt();
        checkLeapYear(year);
    }

    private static void checkLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }

    public void method2(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a Leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("not a leap year");
        }
    }
}
