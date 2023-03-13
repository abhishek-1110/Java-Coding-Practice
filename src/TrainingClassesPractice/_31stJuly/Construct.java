package TrainingClassesPractice._31stJuly;

public class Construct {
    int a = 50;

    Construct(int a) {
        this.a = 10;
    }

    void show() {
        System.out.println("a: " + a);
    }

    public static void main(String[] args) {
        Construct obj1 = new Construct(20);
        obj1.show();
    }
}
