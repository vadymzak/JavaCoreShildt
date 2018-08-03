package ua.shildt.lessons.lambda.lambda2.methodref.imparticulob;

import ua.shildt.lessons.lambda.lambda2.methodref.StringFunc;

//Reference to an instance method of a particular object
public class MethodrefDemo2 {

    static String stringOp(StringFunc sf, String string) {
        return sf.func(string);
    }
    public static void main(String[] args) {

        String inStr = "Test an instance method of a particular object";
        String outStr;

        MyStringOps2 myStringOps2 = new MyStringOps2();
        outStr = stringOp(myStringOps2::strReverse, inStr);

        System.out.println("Before: " + inStr);
        System.out.println("After:  " + outStr);
    }
}
