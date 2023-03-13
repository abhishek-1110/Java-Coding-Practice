package TrainingClassesPractice._8thAugust.StoreData;

import java.util.Scanner;

public class Class1Data {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter id and name: ");
            Class1 c = new Class1();
            int id = scn.nextInt();
            String name = scn.next();
            c.setId(id);
            c.setName(name);
        }
    }
}
