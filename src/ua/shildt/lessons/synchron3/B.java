package ua.shildt.lessons.synchron3;

public class B {

    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " ввійшов в метод B.bar()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " намагається викликати A.last()");
        a.last();

    }

    synchronized void last() {
        System.out.println("В методі B.last()");
    }
}
