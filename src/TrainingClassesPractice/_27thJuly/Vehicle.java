package TrainingClassesPractice._27thJuly;

//public class Vehicle {
//
//}
//class Car extends Vehicle {
//    public static  void main(String[] args) {
//        Vehicle obj = new Vehicle();
//        Vehicle obj1 = new Car();
//        Car obj2 = new Car();
////        Car obj3 = new Vehicle();
//    }
//}
public class Vehicle {
    protected String name;
}
class Car {
    void props(){
        Vehicle v = new Vehicle();
        v.name = "Vehicle 1st";
    }
}
