package ua.shildt.lessons.synchron3;

public class Deadlock implements Runnable {

    A a = new A();
    B b = new B();

    public Deadlock() {
        Thread.currentThread().setName("Головний потік");
        Thread t = new Thread(this, "Другий потік");

        t.start();

        a.foo(b);
        System.out.println("Назад в інший потік");
    }

    public static void main(String[] args) {

        new Deadlock();
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Назад в інший потік");
    }
}
