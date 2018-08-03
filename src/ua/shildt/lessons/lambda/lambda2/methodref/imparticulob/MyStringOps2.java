package ua.shildt.lessons.lambda.lambda2.methodref.imparticulob;

public class MyStringOps2 {

     String strReverse(String s) {
        String result = "";
        int i;
        for(i = s.length()-1; i>=0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

}
