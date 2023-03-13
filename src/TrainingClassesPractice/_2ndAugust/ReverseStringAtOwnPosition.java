package TrainingClassesPractice._2ndAugust;

public class ReverseStringAtOwnPosition {
    public static void main(String[] args) {
        String str = "hello how are you";
        String ans = "";
        String sol = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                sol += ans;
                sol += ' ';
                ans = "";
            } else {
                ans = ch + ans;
            }
        }
        System.out.println(sol + ans);
    }
}
