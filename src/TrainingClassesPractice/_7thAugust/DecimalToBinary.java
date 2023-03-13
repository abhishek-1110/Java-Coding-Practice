package TrainingClassesPractice._7thAugust;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 25;
        toBinary(decimal);
    }

    public static void toBinary(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        toBinary(n / 2);
        System.out.print(n % 2);
    }
}
