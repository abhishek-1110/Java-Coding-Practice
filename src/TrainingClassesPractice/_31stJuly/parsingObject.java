package TrainingClassesPractice._31stJuly;

class Time {
    private int hr, min, sec;

    void fun(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    void display() {
        System.out.println(hr + ":" + min + ":" + sec);
    }

    // return of an object
    Time sum(Time obj) {

        // using obj will print the t2 directly
//        System.out.println(obj.hr + ":" + obj.min);
//        obj.hr = hr + obj.hr;
//        obj.min = min + obj.min;
//        if (obj.min == 60) {
//            obj.hr = obj.hr + 1;
//        } else if (obj.min > 60) {
//            int m = obj.min - 60;
//            obj.hr = obj.hr + 1;
//            obj.min = m;
//        }
//        return obj;

        // for handling seconds
        int m = (sec + obj.sec) / 60;
        obj.sec = (sec + obj.sec) % 60;
//        obj.min = obj.min + m;

        int h = (m + min + obj.min) / 60;
        obj.min = (m + min + obj.min) % 60;
        obj.hr = h + hr + obj.hr;



        // 12 hour format
        if (obj.hr > 12) {
            obj.hr = Math.abs(24 - obj.hr);
        }
        return obj;
    }
}

public class parsingObject {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.fun(11, 20, 40);
        t2.fun(1, 40, 20);

        t3 = t1.sum(t2); // parsing t2 object

        t3.display();


//        t2.sum();
//        t1.display();
//        t2.display();
//        int hr = t1.hr + t2.hr;
//        int min = t1.min + t2.min;
//        System.out.println("Time: " + hr + ":" + min);

    }
}
