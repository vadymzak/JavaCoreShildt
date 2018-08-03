package ua.shildt.lessons.lambda.lambda2.methodref.reftoconstruct;

public class ConstructorRefDemo {

    public static void main(String[] args) {

        MyFunc myClassConst = MyClass::new;

        MyClass mc = myClassConst.func(100);

        System.out.println("val in mc = " + mc.getVal());

        //Generics
        MyFuncGen<Integer> myFuncGen = MyClass2<Integer>::new;

        MyClass2<Integer> mcGen = myFuncGen.func(150);

        System.out.println("Generics instance of myFunk = " + mcGen.getVal());

    }
}
