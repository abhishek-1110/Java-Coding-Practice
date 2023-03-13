package TrainingClassesPractice._30thJuly;

public class GetRowColumnSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("Rows sum: \n");
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("0" + matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println("= " + sum + " ");
        }

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[j][i];
            }
            System.out.print(sum + " ");
        }
    }
}