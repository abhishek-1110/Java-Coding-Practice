package TrainingClassesPractice._30thJuly.OOPs;

public class practice {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(power_fun(a, b));
    }
    public static int power_fun(int a, int b) {
        int f = 1;
        for (int i = 0; i < b; i++) {
            f = f * a;
        }
        return f;
    }
}

