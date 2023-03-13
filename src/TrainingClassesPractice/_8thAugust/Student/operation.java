package TrainingClassesPractice._8thAugust.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<student> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            student student = new student();
            System.out.println("Enter ID and Name of student: ");
            int id = scn.nextInt();
            String name = scn.next();
            student.setId(id);
            student.setName(name);
            list.add(student);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName());
        }
    }
}
