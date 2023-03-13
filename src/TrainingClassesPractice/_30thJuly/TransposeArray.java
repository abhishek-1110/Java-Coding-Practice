package TrainingClassesPractice._30thJuly;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}};
        int row = arr.length;
        int col = arr[0].length;

        int[][] newArr = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
