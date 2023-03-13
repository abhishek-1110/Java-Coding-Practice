package TrainingClassesPractice._30thJuly;

public class SmallElement {
    public static void main(String[] args) {
        int[][] matrix = {{5, 9, 3}, {4, 1, 7}, {7, 2, 5}};

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                min = Math.min(min, matrix[i][j]);
            }
            System.out.println("= " + min + " ");
        }

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[0][i];
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[j][i]);
            }
            System.out.print(min + " ");
        }
    }
}
