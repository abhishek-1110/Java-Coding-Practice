import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter No Of Days: ");
        int noOfDays = scn.nextInt();

        if (noOfDays >= 0 && noOfDays <= 5) {
            System.out.print(Days0To5(noOfDays));
        } else if (noOfDays > 5 && noOfDays <= 10) {
            System.out.print(Days5To10(noOfDays));
        } else if (noOfDays > 10 && noOfDays <= 15) {
            System.out.print(Days10To15(noOfDays));
        } else {
            System.out.print(above15(noOfDays));
        }
    }

    public static int Days0To5(int days) {
        return days * 1;
    }

    public static int Days5To10(int days) {
        int _0to5 = Days0To5(5);
        return (days - 5) * 2 + _0to5;
    }

    public static int Days10To15(int days) {
        int _5to10 = Days5To10(10);
        return (days - 10) * 5 + _5to10;
    }

    public static int above15(int days) {
        int _10to15 = Days10To15(15);
        return (days - 15) * 10 + _10to15;
    }
}
