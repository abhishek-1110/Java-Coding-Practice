package TrainingClassesPractice._3rdAugust;

public class CapitalizeFirstAndLastCharacterOfEachWord {
    public static void main(String[] args) {
        String str = "H how are you";
        System.out.println(helper(str));
    }

    private static String helper(String str) {
        String[] arr = str.split("\\s+");
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.length() == 1) {
                s = s.toUpperCase();
                ans += s + " ";
                continue;
            }
            s = s.substring(0, 1).toUpperCase() + s.substring(1, s.length() - 1) + s.substring(s.length() - 1).toUpperCase();
            ans += s;
            ans += " ";
        }
        return ans.trim();
    }
}
