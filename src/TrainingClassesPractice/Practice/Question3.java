package TrainingClassesPractice.Practice;

import java.util.LinkedList;
import java.util.Queue;

import static TrainingClassesPractice.Practice.Question2.checkPrime;

public class Question3 {
    static class Pair {
        int dist;
        int value;

        Pair(int dist, int value) {
            this.dist = dist;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Queue<Pair> queue = new LinkedList<>();
        int[] arr = {-10, 2, 3, 5, 4, 14, 18, 51, 52, 56, 57, 100};
        int[] ans = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 2) ans[k++] = 2;
            else if (checkPrime(arr[i])) {
                ans[k] = arr[i];
                k++;
            } else {
                forWards(arr[i], queue);
                backWards(arr[i], queue);
                Pair p1 = queue.poll();
                Pair p2 = queue.poll();

                if (p1.dist < p2.dist) {
                    ans[k++] = p1.value;
                } else {
                    ans[k++] = p2.value;
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static void forWards(int n, Queue<Pair> queue) {
        int count = 0;
        for (int i = n + 1; ; i++) {
            count++;
            if (checkPrime(i)) {
                queue.add(new Pair(count, i));
                return;
            }
        }
    }

    public static void backWards(int n, Queue<Pair> queue) {
        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            count++;
            if (checkPrime(i)) {
                queue.add(new Pair(count, i));
                return;
            }
        }
    }
}
