package TrainingClassesPractice._31stJuly;

public class Constructors {
    // constructors are similar to methods having same name as of class name.
    // Constructors are used to initialize the objects. It doesn't have any return type.
    // They are called automatically when an object is created.
    // 1. Default constructor (created by compiler automatically when no constructor is made) // comes under non - parameterized
    // 1. Non parameterized
    // 2. Parameterized

    Constructors(int x) {
        System.out.println(x);
    }

    Constructors() {
        System.out.println("Hello");
    }

    void fun() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
//        Constructors obj = new Constructors();
        new Constructors(10).fun(); // call method with constructor call otherwise you need to call with object


    }
}