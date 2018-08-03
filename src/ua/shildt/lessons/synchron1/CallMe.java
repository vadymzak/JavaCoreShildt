package ua.shildt.lessons.synchron1;

public class CallMe {

    int flag = 0;
    public void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
