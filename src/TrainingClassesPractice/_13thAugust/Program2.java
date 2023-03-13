package TrainingClassesPractice._13thAugust;

import java.util.HashMap;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        int[] arr = {1};

    }

    int maxGroups(int input1, int[] input2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input2.length; i++) {
            map.put(input2[i], map.getOrDefault(input2[i], 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                ans += e.getValue() / 2;
            }
        }
        return ans;
    }
}
