package TrainingClassesPractice;

public class MultiplicationTable {
    public static void main(String[] args) {
        int start = 3;
        int end = 7;

        for (int i = start; i <= end; i++) {
            System.out.println("Table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
