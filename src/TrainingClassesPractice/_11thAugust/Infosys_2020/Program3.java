package TrainingClassesPractice._11thAugust.Infosys_2020;

import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {
        String s = "5u6@25g7#@";
        int count = 0;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if ((s.charAt(i) - '0') % 2 == 0) {
                    even.add(s.charAt(i) - '0');
                } else {
                    odd.add(s.charAt(i) - '0');
                }
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                continue;
            } else {
                count++;
            }
        }
        String ans = "";
        if (count % 2 == 0) {
            int i = 0;
            int j = 0;
            while (i < even.size() || j < odd.size()) {
                if (i < even.size())
                    ans += even.get(i);
                if (j < odd.size())
                    ans += odd.get(j);
                i++;
                j++;
            }
        } else {
            int i = 0;
            int j = 0;
            while (i < even.size() || j < odd.size()) {
                if (j < odd.size())
                    ans += odd.get(j);
                if (i < even.size())
                    ans += even.get(i);
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
