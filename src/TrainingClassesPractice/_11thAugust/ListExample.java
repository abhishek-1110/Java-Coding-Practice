package TrainingClassesPractice._11thAugust;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        System.out.println(list);

        list.add(0, "yellow");
        System.out.println(list);
        System.out.println(list.get(1));



    }
}
