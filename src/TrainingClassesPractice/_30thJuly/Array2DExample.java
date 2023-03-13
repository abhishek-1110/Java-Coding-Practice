package TrainingClassesPractice._30thJuly;

public class Array2DExample {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] arr = new int[rows][cols];
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
