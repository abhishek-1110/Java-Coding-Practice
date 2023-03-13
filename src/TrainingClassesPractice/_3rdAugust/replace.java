package TrainingClassesPractice._3rdAugust;

public class replace {
    public static void main(String[] args) {
        String str = "Uttaranchal Univeristy";
        String r = "nchal";
        String rep = "khand";
        String ans = "";
        int index = str.indexOf(r);
        for (int i = 0; i < str.length(); ) {
            if (i == index) {
                ans += r;
                i += rep.length();
            } else {
                ans += str.charAt(i);
                i++;
            }
        }
        System.out.println(ans);
    }
}
