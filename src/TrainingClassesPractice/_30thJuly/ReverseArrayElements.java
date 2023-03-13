package TrainingClassesPractice._30thJuly;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr[0].length - 1;
            while (low < high) {
                int temp = arr[i][high];
                arr[i][high] = arr[i][low];
                arr[i][low] = temp;
                low++;
                high--;
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
