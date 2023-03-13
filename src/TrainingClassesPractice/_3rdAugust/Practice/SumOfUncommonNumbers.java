package TrainingClassesPractice._3rdAugust.Practice;

import java.util.*;

public class SumOfUncommonNumbers {
    public static void main(String[] args) {
        int[] input1 = {2, 2, 5, 5, 6, 6};
        int[] input2 = {1, 2, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input1.length; i++) {
            if (!map.containsKey(input1[i])) {
                map.put(input1[i], 1);
            } else {
                map.put(input1[i], map.get(input1[i]) + 1);
            }
        }
        for (int i = 0; i < input2.length; i++) {
            if (!map.containsKey(input2[i])) {
                map.put(input2[i], 1);
            } else {
                map.put(input2[i], map.get(input2[i]) + 1);
            }
        }

        List<Integer> ls = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                ls.add(e.getKey());
            }
        }
        System.out.println(ls);
        int sum = findSum(ls);
        int ans = getNum(sum);
        System.out.println(ans);
    }

    private static int getNum(int sum) {
        int ans = 0;
        while (sum != 0) {
            ans += sum % 10;
            sum /= 10;
        }
        if (ans / 10 != 0) return getNum(ans);
        return ans;
    }

    public static int findSum(List<Integer> ls) {
        int sum = 0;
        for (int i = 0; i < ls.size(); i++) {
            sum += ls.get(i);
        }
        return sum;
    }
}
