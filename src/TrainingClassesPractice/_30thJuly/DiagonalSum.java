package TrainingClassesPractice._30thJuly;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int sum = 0;
        int row = arr.length;
        int col = arr[0].length;

        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
            sum += arr[i][j];
            i++;
            j--;
        }
        System.out.println(sum);
    }
}