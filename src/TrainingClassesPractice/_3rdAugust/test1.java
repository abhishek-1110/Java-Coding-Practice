package TrainingClassesPractice._3rdAugust;

public class test1 {
    public static void main(String[] args) {
        String str = "fgh3$sdhj2@kpl";
        System.out.println(helper(str));
//        System.out.println(method1(str));
    }

    private static String helper(String str) {
        String ans = "";
        int num;
        for (int i = 0; i < str.length(); ) {
            if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                num = str.charAt(i) - '0';
                i++;
                i += num;
            } else {
                if (str.charAt(i) == '0') {
                    i++;
                }
                ans += str.charAt(i);
                i++;
            }
        }
        return ans;
    }

    public static String method1(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 48; j <= 57; j++) {
                if (ch == (char) j) {
                    i += ch - j;
                } else {
                    ans += ch;
                }
            }
        }
        return ans;
    }
}
