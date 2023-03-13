public class NQUEEN {
    static boolean check = false;

    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        helper(matrix, 0);
        if (!check) System.out.println("NO SOLUTION.");
    }

    private static void helper(int[][] matrix, int row) {
        if (row == matrix.length) {
            // printing the answer
            check = true;
            for (int[] ints : matrix) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int col = 0; col < matrix.length; col++) {
            if (canPlace(matrix, row, col)) {
                // do
                matrix[row][col] = 1;

                // recur
                helper(matrix, row + 1);

                // backtrack
                matrix[row][col] = 0;
            }
        }
    }

    private static boolean canPlace(int[][] matrix, int row, int col) {
        // vertically check or you can say upwards
        for (int i = row; i >= 0; i--) {
            if (matrix[i][col] == 1) return false;
        }

        // left
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 1) return false;
        }

        // right
        for (int i = row, j = col; i >= 0 && j < matrix.length; i--, j++) {
            if (matrix[i][j] == 1) return false;
        }
        return true;
    }
}
