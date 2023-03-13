package TrainingClassesPractice.Array;

public class instanceVariables {
    // variables which are defined inside a class but outside a method
    // static variables whose single copy is shared by different objects
    // static keyword is a memory management tool
    int a;

    void fun() {
        a = 10;
    }

    void show() {
        System.out.println("a: " + a);
    }

    public static void main(String[] args) {
        instanceVariables obj1 = new instanceVariables();
        instanceVariables obj2 = new instanceVariables();
        obj1.fun();
        obj2.show();
    }
}
