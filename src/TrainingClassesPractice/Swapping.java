package TrainingClassesPractice;

public class Swapping {
    public static void main(String[] args) {
        int a = 500;
        int b = 10;
        System.out.println("Before: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        method1(a, b);
        method2(a, b);
    }

    private static void method1(int a, int b) {
        // using temp
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    private static void method2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nAfter: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
