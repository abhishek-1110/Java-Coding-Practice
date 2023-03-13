package TrainingClassesPractice._5thAugust;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
//            int min = Integer.MAX_VALUE;
            int min = arr[0][i];
            for (int j = 1; j < N; j++) {
                if (arr[j][i] < min) {
                    min = arr[j][i];
                }
            }
            System.out.print(min + " ");
        }
    }
}
