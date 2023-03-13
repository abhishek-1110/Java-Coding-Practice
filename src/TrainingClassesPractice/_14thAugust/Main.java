package TrainingClassesPractice._14thAugust;

class Vehicle {
    int amount;
    String model;

    Vehicle(int amount, String model) {
        this.amount = amount;
        this.model = model;
    }
}

class Mercedes extends Vehicle {
    Mercedes(int amount, String model) {
        super(amount, model);
    }

    void display() {
        System.out.println("Amount: " + amount + ", " + "Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Mercedes ob = new Mercedes(4000, "A");
        ob.display();
    }
}