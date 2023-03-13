package TrainingClassesPractice._2ndAugust;

public class Test {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev += str.charAt(str.length() - 1 - i);
            // rev = str.charAt(i) + rev;
        }
        return rev;
    }
}
