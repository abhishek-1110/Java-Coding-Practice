package TrainingClassesPractice._2ndAugust;

public class ReverseII {
    public static void main(String[] args) {
        String str = "Hello how are you";
        String s = "";
        // start from last
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
//        System.out.println(s);
        // then use reverseStringAtOwnPosition
        str = s;
        String ans = "";
        String sol = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                sol += ans;
//                System.out.println(sol);
                sol += ' ';
                ans = "";
            } else {
                ans = ch + ans;
            }
        }
        System.out.println(sol + ans);
    }
}
