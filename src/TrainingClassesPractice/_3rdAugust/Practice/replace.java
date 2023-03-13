package TrainingClassesPractice._3rdAugust.Practice;

public class replace {
    public static void main(String[] args) {
        String str = "uttaranchal univeristy";
        String st = "khand";
        String s = "";
        int ind = 0;
            for (int i = 0; i < str.length(); i++) {
            ind = str.indexOf("nchal");
        }
        s = str.substring(0, ind) + st + str.substring(ind + st.length());
        System.out.println(s);
    }
}
