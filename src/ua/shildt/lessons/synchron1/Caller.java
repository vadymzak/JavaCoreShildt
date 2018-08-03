package ua.shildt.lessons.synchron1;


public class Caller implements Runnable {

    String msg;
    CallMe target;
    Thread t;

    public Caller(String msg, CallMe target) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
