package TrainingClassesPractice._7thAugust;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder();
        helper(str, sb, str.length() - 1);
        System.out.println(sb);
    }

    public static void helper(String str, StringBuilder sb, int high) {
        if (high == -1) return;
        sb.append(str.charAt(high));
        helper(str, sb, high - 1);
    }
}
