package ua.shildt.lessons.synchron3;

public class A {

    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " ввійшов в метод A.foo()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " намагається викликати B.last()");
        b.last();

    }

    synchronized void last() {
        System.out.println("В методі A.last()");
    }
}
