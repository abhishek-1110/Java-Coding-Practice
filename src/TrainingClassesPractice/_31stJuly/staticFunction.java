package TrainingClassesPractice._31stJuly;
class GG {
   static void sun() {
        System.out.println("Hi");
    }
}
public class staticFunction {
    static void fun() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        GG.sun(); // static functions are always called by their class name (for methods of other classes)...
    }
}
