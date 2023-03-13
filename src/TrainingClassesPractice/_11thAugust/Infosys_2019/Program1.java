package TrainingClassesPractice._11thAugust.Infosys_2019;

public class Program1 {
    public static void main(String[] args) {
        String s = "4365188";
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                st += s.charAt(i);
            }
        }
        String ans = "";
        for (int i = 0; i < st.length(); i++) {
            int n = st.charAt(i) - '0';
            n = n * n;
            ans += n;
        }
        System.out.println(ans.substring(0, 4));
    }
}