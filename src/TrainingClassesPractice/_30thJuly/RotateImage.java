package TrainingClassesPractice._30thJuly;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void rotate(int[][] matrix) {
        // taking transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // then reversing array by swapping
        for (int i = 0; i < matrix.length; i++) {
            int low = 0, high = matrix.length - 1;
            while (low <= high) {
                int temp = matrix[i][high];
                matrix[i][high] = matrix[i][low];
                matrix[i][low] = temp;
                low++;
                high--;
            }
        }
    }
}