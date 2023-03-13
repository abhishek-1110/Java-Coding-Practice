package TrainingClassesPractice._3rdAugust;

public class SwapFirstAndLastCharacterOfEachWord {
    public static void main(String[] args) {
        String str = "hellwo a ho are you";
        System.out.println(helper(str));
    }

    public static String helper(String str) {
        String ans = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.length() == 1) {
                ans += s.charAt(0);
                ans += " ";
            }
            char first, last;
            String rem = "";
            first = s.charAt(0);
            last = s.charAt(s.length() - 1);
            //System.out.println(first + " " + last);
            rem = s.substring(1, s.length() - 1);
            //System.out.println(rem);

            ans += last + rem + first + " ";
        }
        return ans.trim();
    }
}
