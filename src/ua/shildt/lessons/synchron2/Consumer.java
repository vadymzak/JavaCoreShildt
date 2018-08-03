package ua.shildt.lessons.synchron2;

public class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Споживач").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();

        }
    }
}
