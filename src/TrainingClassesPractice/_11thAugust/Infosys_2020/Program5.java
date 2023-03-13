package TrainingClassesPractice._11thAugust.Infosys_2020;

public class Program5 {
    public static void main(String[] args) {
        String s = "ghftd:1246";
        String[] arr = s.split(":");
        String st = arr[1];
        int num = 0;
        for (int i = 0; i < st.length(); i++) {
            int n = st.charAt(i) - '0';
            num += n * n;
        }
        st = arr[0];
        String ans = "";
        if (num % 2 == 0) {
            for (int i = st.length() - 1; i < st.length(); i++) {
                ans += st.charAt(i);
            }
            for (int i = 0; i < st.length() - 1; i++) {
                ans += st.charAt(i);
            }
        } else {
            for (int i = 2; i < st.length(); i++) {
                ans += st.charAt(i);
            }
            for (int i = 0; i < 2; i++) {
                ans += st.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
