package TrainingClassesPractice._3rdAugust.Practice;

public class ReducedString {
    public static void main(String[] args) {
        String input1 = "LOCKDOWN";
        String ans = reducedString(input1);
        System.out.println(ans);
    }

    public static String reducedString(String s) {
        if (s == null || s.length() == 0) return "";
        String ans = "";
        ans += s.charAt(0);
        int n = s.length();
        if (n % 2 == 0) {
            int i = 1;
            while (i < n) {
                ans += s.charAt(i);
                i += 2;
            }
        } else {
            int i = 2;
            while (i < n) {
                ans += s.charAt(i);
                i += 2;
            }
        }
        return ans;
    }
}
