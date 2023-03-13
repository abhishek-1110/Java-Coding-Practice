package TrainingClassesPractice._1stAugust.StringDevelopment;

public class Stringtest1 {
    public static String caseConversion(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            } else if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
            }
            ans += ch;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "heL#Lo";
        System.out.println(caseConversion(str));

    }
}