package TrainingClassesPractice._11thAugust.Infosys_2019;

public class Program2 {
    public static void main(String[] args) {
        String s = "sd&hg#j";
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i <= j) {
            if (c[i] >= 'a' && c[i] <= 'z' && c[j] >= 'a' && c[j] <= 'z') {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            } else if (c[i] >= 'a' && c[i] <= 'z') {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(String.valueOf(c));
    }
}
