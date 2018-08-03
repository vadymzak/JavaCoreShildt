package ua.youtobe.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        Stream<String> stringStream = list.stream();
        stringStream.forEach(x -> System.out.println(x));

        list.stream().forEach(x -> System.out.println(x));

        stringStream = list.stream();
        stringStream.filter(x -> {
            System.out.println("Hello");
            return x.equals("one");
        }).count();
    }
}
