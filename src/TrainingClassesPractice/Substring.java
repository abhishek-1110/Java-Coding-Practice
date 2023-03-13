package TrainingClassesPractice;

public class Substring {
    public static void main(String[] args) {
        String s = "ssa";
        String t = "mississagua";
        System.out.println(helper(s, t, 0));
    }

    public static boolean helper(String s, String t, int index) {
        if (t.startsWith(s)) return true;

        if (index == s.length()) {
            return true;
        }
        if (index == t.length()) return false;
        if (s.charAt(index) == t.charAt(index)) {
            return helper(s, t, index + 1);
        } else {
            return helper(s, t.substring(index + 1), index + 1);
        }
    }
}
