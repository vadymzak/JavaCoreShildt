package ua.shildt.lessons.lambda.lambda2.methodref.staticmethod;

import ua.shildt.lessons.lambda.lambda2.methodref.StringFunc;

//Reference to a static method
public class MethodrefDemo {

    static String stringOp(StringFunc sf, String string) {
        return sf.func(string);
    }
    public static void main(String[] args) {

        String inStr = "Test Method references";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Before: " + inStr);
        System.out.println("After:  " + outStr);
    }
}
