package ua.shildt.lessons.stream.stream2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {
        ArrayList<Double> mylist = new ArrayList<>();

        mylist.add(7.0);
        mylist.add(18.0);
        mylist.add(10.0);
        mylist.add(24.0);
        mylist.add(17.0);
        mylist.add(5.0);

        Stream<Double> dStream = mylist.stream().map((a) -> Math.sqrt(a));

        double productOfSqrRoots = dStream.reduce(1.0, (a, b) -> a * b);

        System.out.println("prod -  " + productOfSqrRoots);


    }
}
