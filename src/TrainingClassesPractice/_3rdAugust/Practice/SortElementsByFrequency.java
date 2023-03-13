package TrainingClassesPractice._3rdAugust.Practice;

import java.util.*;

public class SortElementsByFrequency {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(7);
        freqSort(list);
    }

    private static void freqSort(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }

        Collections.sort(list, (k1, k2) -> {
            int freq1 = map.get(k1);
            int freq2 = map.get(k2);

            if (freq1 != freq2) {
                return freq2 - freq1; // descending
            }
            return list.indexOf(k1) - list.indexOf(k2);
        });

        System.out.println(list);
    }
}
