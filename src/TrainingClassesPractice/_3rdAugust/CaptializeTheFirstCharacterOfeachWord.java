package TrainingClassesPractice._3rdAugust;

public class CaptializeTheFirstCharacterOfeachWord {
    public static void main(String[] args) {
        String str = "hello how are you";
        //System.out.println(helper(str));
        System.out.println(method(str));
    }

    private static String helper(String str) {
        String[] arr = str.split("\\s+");
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
            ans += s;
            ans += " ";
        }
        return ans.trim();
    }

    public static String method(String str) {
        String ans = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            char first = s.charAt(0);
            if (first >= 97 && first <= 122) {
                first = (char) (first - 32);
            }
            ans += first;
            ans += s.substring(1) + " ";
        }
        return ans.trim();
    }
}