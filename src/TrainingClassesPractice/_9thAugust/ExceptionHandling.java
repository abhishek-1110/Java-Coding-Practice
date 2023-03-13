package TrainingClassesPractice._9thAugust;

public class ExceptionHandling {
    // exceptions are the abnormal conditions through which our program gets terminated abruptly.
    // 1. divide by zero --- Arithmetic Error
    // 2. Null Pointer Exception
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        try {
//            int c = a / b;
//            System.out.println(c);
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("Code executed.");
//        }

        int[] arr = {1, 2, 3, 4};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("\nIndex out of bound exception arises.");
        }
    }
}