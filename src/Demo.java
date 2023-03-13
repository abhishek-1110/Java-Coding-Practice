import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int L = scn.nextInt();
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int width = scn.nextInt();
            int height = scn.nextInt();

            System.out.println(getAnswer(width, height, L));
        }

    }
    public static String getAnswer(int width, int height, int L) {
        if (width < L || height < L) {
            return "New One";
        } else if (width != height && width > L || height > L) {
            return "Sorry";
        } else if (width >= height && width == L && height == L){
            return "Got it";
        }
        return "-1";
    }
}
