package ua.shildt.lessons.synchron1;

public class Synch1 {

    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller("Вітаю ", target);
        Caller ob2 = new Caller("в синхрон.", target);
        Caller ob3 = new Caller(" світі", target);

        ob1.t.start();
        //ob1.t.join();
        ob2.t.start();
        //ob2.t.join();
        ob3.t.start();
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
