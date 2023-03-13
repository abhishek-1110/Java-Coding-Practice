package TrainingClassesPractice._31stJuly;

import java.util.LinkedList;
import java.util.Queue;

public class functionOverloading {
    // in which methods have same names but the parameters are different
    public static void main(String[] args) {
        method1(10, 20);
        method1("Abhishek", 20);
    }

    public static void method1(int a, int b) {
        System.out.println(a + " " + b);

    }

    public static void method1(String s, int age) {
        System.out.print(s + " " + age);
    }
}