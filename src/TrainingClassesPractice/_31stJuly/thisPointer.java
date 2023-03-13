package TrainingClassesPractice._31stJuly;

public class thisPointer {
    int a;

    // this pointer points to current class elements.
    // this is used to differentiate between local variable and instance variable. used to put values
    // in instance variables.
    // this can be used to refer current class instance variable.
    // this can be used to invoke current class method (implicitly)
    // this() can be used to invoke current class constructor.
    // this can be passed as an argument in the method call.
    // this can be passed as argument in the constructor call.
    // this can be used to return the current class instance from the method.
    void fun(int a) {
        this.a = a;
    }

    void show() {
        System.out.println("a: " + a);
    }

    public static void main(String[] args) {
        thisPointer ob = new thisPointer();
        ob.fun(10);
        ob.show();
    }
}