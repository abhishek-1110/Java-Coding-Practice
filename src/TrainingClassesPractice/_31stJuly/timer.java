package TrainingClassesPractice._31stJuly;

//package TrainingClassesPractice._31stJuly;
//
public class timer {
    public static void main(String[] args) {
//        // Home workkk
//        int hr = 22;
//        int min = 59;
//        int sec = 50;
//        boolean s = false;
//        if (sec == 59) {
//            sec = sec + 1;
//            int m = sec / 60;
//            sec = sec % 60;
//        }
//        if (min == 59) {
//            min = min % 60 + m;
//            int h = min / 60;
//            min = min % 60;
//        }
//        hr = hr + h;
//        if (hr == 24) {
//            System.out.println(hr % 24 + ":" + min + ":" + sec);
//        } else {
//            System.out.println(hr % 24 + ":" + min + ":" + sec);
//        }
//    }
        int hr = 23;
        int min = 59;
        int sec = 59;

        int addtomin = 0;
        if (sec >= 59) {
            addtomin = sec % 60;
            int newsec = sec / 60;
            sec = newsec;
        }
        if (min >= sec || addtomin > 1) {

        }
    }
}
