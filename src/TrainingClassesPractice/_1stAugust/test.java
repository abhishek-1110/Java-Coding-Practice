package TrainingClassesPractice._1stAugust;

// one interface can inherit other interface using extends keyword
interface GG {
    void fun();
}

interface KK extends GG {
    void sun();
}

public class test implements KK {
    public void fun() {

    }

    @Override
    public void sun() {

    }

    public static void main(String[] args) {

    }
}
