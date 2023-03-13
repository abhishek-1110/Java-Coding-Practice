package TrainingClassesPractice._31stJuly;
// overriding...
class test1 {
    public int fun() {
        System.out.println("hi");
        return 1;
    }
}

public class inheritance1 extends test1 {
    public static void main(String[] args) {
        inheritance1 obj = new inheritance1();
        obj.fun();
    }

    public int fun() {
        super.fun(); // used to access parent class
        System.out.println("Hello");
        return 1;
    }
}
