package TrainingClassesPractice._2ndAugust;

public class Test1 {
    public static void main(String[] args) {
        String s = "Aeroplane";
        System.out.println(getAnswer(s));
    }

    public static String getAnswer(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (!checkVowel(s.charAt(i))) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    public static boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}




