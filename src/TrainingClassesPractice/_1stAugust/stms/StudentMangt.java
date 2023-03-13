package TrainingClassesPractice._1stAugust.stms;

public class StudentMangt {
    public static void main(String[] args) {
        student[] arr = new student[3];

        operation.input(arr); // to call method in same package classname.method name from another class
        operation.display(arr);
    }
}
