package TrainingClassesPractice._31stJuly;

class DD {
    DD() {
        System.out.println("I am in DD");
    }
}

class MM extends DD {
    MM() {
        super();
        System.out.println("I am in MM");
    }
}

public class constructorChaining extends MM {
    constructorChaining() {
        System.out.println("I am in main class");
    }

    public static void main(String[] args) {
        constructorChaining obj = new constructorChaining();
    }
}
