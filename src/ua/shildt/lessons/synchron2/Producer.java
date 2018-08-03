package ua.shildt.lessons.synchron2;

public class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Постачальник").start();
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            q.put(i++);
        }

    }
}
