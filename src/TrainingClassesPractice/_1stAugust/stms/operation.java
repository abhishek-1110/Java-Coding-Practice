package TrainingClassesPractice._1stAugust.stms;

import java.util.Scanner;

public class operation {
    public static void input(student[] arr) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the id and name: ");
            int roll = scn.nextInt();
            String name = scn.next();
            student obj = new student();
            obj.setId(roll);
            obj.setName(name);
            arr[i] = obj;
        }
    }

    public static void display(student[] arr) {
        System.out.println("Student Data: ");
        for (int i = 0; i < arr.length; i++) {
            student s = arr[i];
            System.out.println(s.getId() + " " + s.getName());
        }
    }
}
