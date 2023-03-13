package TrainingClassesPractice._1stAugust;

// abstract class have some defined or undefined functions.
// the class which is inheriting the abstract class should implement (define) the undefined function.
// there is important to write abstract in front of undefined function in abstract class and method.
// no need to write abstract in front of defined method
abstract class abc {
    abstract void fun(); // abstract function

    void sun() {
        System.out.println("kkk");
    }
}

public class abstractExample extends abc {
    void fun() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        abstractExample obj = new abstractExample();
        obj.fun();
    }
}
