package ua.shildt.lessons.lambda.lambda2.methodref.reftoconstruct;

public class MyClass2<T> {

    private T val;

    public MyClass2(T val) {
        this.val = val;
    }

    public MyClass2() {
        val = null;
    }

    public T getVal() {
        return val;
    }

}
