package TrainingClassesPractice._7thAugust;

public class Recursion1 {
    public static void main(String[] args) {
        // recursion : when a function calls itself again and again until a based condition is reached.
        Recursion1 ob = new Recursion1();
        int a = 3;
        ob.fun(a);
    }

    public void fun(int a) {
        if (a == 0) {
            return;
        }
        System.out.println(a);
        fun(a - 1);
    }
}
