package ua.shildt.lessons.lambda.lambda1;

interface MyTest{
    boolean test(int n);
}

interface  MyTest2{
    int getValue(int a, int b);
}

interface  MyTest3<T>{
    T test(T s);
}
public class Lambda1 {

    public static String modString(MyTest3<String> strMod, String s){
        return strMod.test(s);
    }

    public static void main(String[] args) {
        MyTest myTest = (n) -> (n % 2) == 0;
        System.out.println(myTest.test(7));
        MyTest2 myTest1 = (a, b) -> {
            int c = a * b;
            int d = c - 23;
            return d;
        };
        System.out.println(myTest1.getValue(10, 15));
        //Generics
        MyTest3<String> myTest3 = (str) -> {
            String s = "Test " + str;
            return s;
        };

        System.out.println(myTest3.test("String"));

        MyTest3<Integer> myTest4 = (number) -> {
            int i = number + 5;
            return i;
        };

        System.out.println(myTest4.test(2));
        //As parameter of function
        String str1 = "My String";
        String upper = modString((str) -> str.toUpperCase(), str1);
        System.out.println(upper);
        String lower = modString((st) -> st.toLowerCase(), str1);
        System.out.println(lower);

    }
}
