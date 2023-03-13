package TrainingClassesPractice._2ndAugust;

public class CountVowels {
    public static void main(String[] args) {
        int count = countVowels("aeiouAEIOU");
        System.out.println(count);
    }

    private static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (checkVowel(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean checkVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}
