package ua.shildt.lessons.lambda.lambda2.methodref.imarbitraryob;

public class Hightemp {

    private int hTemp;

    public Hightemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(Hightemp h2) {
        return hTemp == h2.hTemp;
    }

    boolean lessThenTemp(Hightemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
