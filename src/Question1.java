import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter your current Salary: ");
        int currentSalary = scn.nextInt(); // for salary

        // for gender
        System.out.print("Enter your gender (F/M): ");
        String gender = scn.next();

        // no. of years
        System.out.print("Enter your Years of Experience: ");
        int noOfYears = scn.nextInt();

        if (noOfYears < 3) {
            System.out.println("No Increment");
            System.exit(0);
        }

        if (gender.charAt(0) == 'F' && noOfYears > 5) {
            System.out.println(Female_fiveYears(currentSalary));
        }

        if (gender.charAt(0) == 'F' && noOfYears > 3 && noOfYears <= 5) {
            System.out.println(Female_betweenThreeAndFive(currentSalary));
        }

        if (gender.charAt(0) == 'M' && noOfYears > 5) {
            System.out.println(Male_fiveYears(currentSalary));
        }

        if (gender.charAt(0) =='M' && noOfYears > 3 && noOfYears <= 5) {
            System.out.println(Male_betweenThreeAndFive(currentSalary));
        }
    }

    private static int Female_fiveYears(int currentSalary) {
        // 20 % increment
        int inc = (20 * currentSalary) / 100;
        return currentSalary + inc;
    }

    private static int Female_betweenThreeAndFive(int currentSalary) {
        // 15% increment
        int inc = (15 * currentSalary) / 100;
        return currentSalary + inc;
    }

    private static int Male_fiveYears(int currentSalary) {
        // 15% increment
        int inc = (15 * currentSalary) / 100;
        return currentSalary + inc;
    }

    private static int Male_betweenThreeAndFive(int currentSalary) {
        // 10% increment
        int inc = (10 * currentSalary) / 100;
        return currentSalary + inc;
    }
}
