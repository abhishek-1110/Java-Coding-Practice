package TrainingClassesPractice._3rdAugust.Practice;

public class CharactersNumbers {
    public static void main(String[] args) {
        String input1 = "null";
        String input2 = "1";
        System.out.println(helper(input1, input2));
    }

    public static String helper(String s, String t) {
        if (s == null) return "NULL";
        if (t.equals("0")) {
            int ans = 0;
            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    flag = true;
                    ans += (s.charAt(i) - '0');
                }
            }
            if (!flag) {
                return "ZERO";
            } else {
                return "" + ans;
            }
        } else if (t.equals("1")) {
            boolean flag = false;
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    flag = true;
                    ans += s.charAt(i);
                }
            }
            if (!flag) {
                return "ZERO";
            } else {
                return ans;
            }
        }
        return "ZERO";
    }
}
