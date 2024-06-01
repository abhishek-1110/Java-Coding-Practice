// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {

        // N queen problem
        int n = 4; // 4 x 4
        int[][] matrix = new int[n][n];
        
        helper(n, matrix, 0);
             for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
    
    public static boolean helper(int n, int[][] matrix, int row) {
        if (row == n) {

            return true;
        }
        
        for (int i = 0; i < n; i++) {
            // pass matrix, row, column
            if (canPlace(matrix, row, i)) {
                // place
                matrix[row][i] =  1;
                
                // recur
                if (helper(n, matrix, row + 1)) {
                    return true;
                }
                
                // backtrack
                matrix[row][i] = 0;
            }
            
        }
        return false;
    }
    
    public static boolean canPlace(int[][] matrix, int row, int col) {
        // checks vertically upwards
        for (int i = row; i >= 0; i--) {
            if (matrix[i][col] == 1) return false;
        }
        
        // checks left diagonally
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 1) return false;
        }
        // checks right diagonally
        for (int i = row, j = col; i >= 0 && j < matrix.length; i--, j++) {
            if (matrix[i][j] == 1) return false;
        }
        return true;
    }
}
