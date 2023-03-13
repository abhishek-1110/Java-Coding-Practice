package TrainingClassesPractice.Practice;

import static TrainingClassesPractice.Practice.Question2.checkPrime;

public class Question3_ {
    public static void main(String[] args) {
        int n = 89;
        if (!checkPrime(n)) {
            int i = n - 1;
            int count1 = 0;
            for (; i >= 2; i--) {
                count1++;
                if (checkPrime(i)) {
                    break;
                }
            }
            int j = n + 1;
            int count2 = 0;
            for (; ; j++) {
                count2++;
                if (checkPrime(j)) {
                    break;
                }
            }
            if (count1 < count2) {
                System.out.print(i);
            } else {
                System.out.println(j);
            }
        } else {
            System.out.print("Already Prime");
        }
    }
}