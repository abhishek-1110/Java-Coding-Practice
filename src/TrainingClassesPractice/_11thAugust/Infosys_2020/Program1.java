package TrainingClassesPractice._11thAugust.Infosys_2020;

public class Program1 {
    public static void main(String[] args) {
        String ques = "3, 2, 6, 5, 1, 4, 8, 9";
        String s = "";
        for (int i = 0; i < ques.length(); i++) {
            if (ques.charAt(i) == ',' || ques.charAt(i) == ' ') {
                continue;
            } else {
                s += ques.charAt(i);
            }
        }
        int pos5 = 0;
        int pos8 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '5') {
                pos5 = i;
            }
            if (s.charAt(i) == '8') {
                pos8 = i;
            }
        }

        int num1 = 0;
        for (int i = 0; i < pos5; i++) {
            num1 += s.charAt(i) - '0';
        }

        for (int i = pos8 + 1; i < s.length(); i++) {
            num1 += s.charAt(i) - '0';
        }

        int num2 = 0;
        for (int i = pos5; i <= pos8; i++) {
            num2 = num2 * 10 + s.charAt(i) - '0';
        }
        System.out.println(num1 + num2);
    }
}
