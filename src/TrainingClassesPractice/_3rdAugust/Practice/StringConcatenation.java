package TrainingClassesPractice._3rdAugust.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringConcatenation {
    public static void main(String[] args) {
        String input1 = "fruits";
        String input2 = "are good";
        System.out.println(stringConcatenation(input1, input2));
        System.out.println(fun(input1, input2));
    }

    private static String stringConcatenation(String input1, String input2) {
        if (input1 == null || input1.length() == 0 || input2 == null || input2.length() == 0) return "";
        List<Character> ls = new ArrayList<>();
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == ' ') continue;
            if (ls.contains(input1.charAt(i))) continue;
            else ls.add(input1.charAt(i));
        }

        for (int i = 0; i < input2.length(); i++) {
            if (input2.charAt(i) == ' ') continue;
            if (ls.contains(input2.charAt(i))) continue;
            else ls.add(input2.charAt(i));
        }
        Collections.sort(ls);
        Collections.reverse(ls);
        String ans = "";
        for (int i = 0; i < ls.size(); i++) {
            ans += ls.get(i);
        }
        return ans;
    }

    private static String fun(String input1, String input2) {
        if (input1 == null || input1.length() == 0 || input2 == null || input2.length() == 0) return "";
        String s = input1 + input2;
        int[] arr = new int[123];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') continue;
            arr[s.charAt(i)]++;
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                ans = (char) (i) + ans;
            }
        }
        return ans;
    }
}
