package TrainingClassesPractice._31stJuly.Practice;

public class HollowMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            // top wall
            for (int c = c1; c <= c2; c++) {
                System.out.print(matrix[r1][c] + " ");
            }

            // right wall
            for (int r = r1 + 1; r <= r2; r++) {
                System.out.print(matrix[r][c2] + " ");
            }

            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) {
                    System.out.print(matrix[r2][c] + " ");
                }
                for (int r = r2; r > r1 ; r--) {
                    System.out.print(matrix[r][c1] + " ");
                }
            }
            break;
        }
    }
}
