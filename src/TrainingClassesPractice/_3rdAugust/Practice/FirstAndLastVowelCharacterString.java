package TrainingClassesPractice._3rdAugust.Practice;

import static TrainingClassesPractice._2ndAugust.Test1.checkVowel;

public class FirstAndLastVowelCharacterString {
    public static void main(String[] args) {
//        String[] arr = {"orero", "sirish", "apple"};
        String[] arr = {"Mango", "Banana"};
        System.out.println(helper(arr));
    }

    public static String helper(String[] arr) {
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (checkVowel(s.charAt(0)) && checkVowel(s.charAt(s.length() - 1))) {
                ans += s;
            }
        }
        return ans.length() == 0 ? "no matches found" : ans;
    }
}
