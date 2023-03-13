package TrainingClassesPractice._5thAugust;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
        String str = "i love football because i love sports";
        String[] arr = str.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(e.getKey());
            }
        }
    }
}