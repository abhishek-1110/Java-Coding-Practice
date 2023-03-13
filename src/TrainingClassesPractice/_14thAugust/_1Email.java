package TrainingClassesPractice._14thAugust;

public class _1Email {
    public static void main(String[] args) {
        String str = "AbcDefGhi@gmail.com";
        String ans = "";
        int len = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                break;
            } else {
                ans += str.charAt(i);
                len++;
            }
        }
        ans += len;
        System.out.println(ans);
    }
}
