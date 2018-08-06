package ua.shildt.lessons.stream.stream1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Create a list of Integer values.
        ArrayList<Integer> myList = new ArrayList<>( );
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Original list: " + myList);

        // Obtain a Stream to the array list.
        Stream<Integer> myStream = myList.stream();

        // Obtain the minimum and maximum value by uses of min(),
        // max(), isPresent(), and get().
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()) System.out.println("Minimum value: " +
                minVal.get());

        // Must obtain a new stream because previous call to min()
        // is a terminal operation that consumed the stream.
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if(maxVal.isPresent()) System.out.println("Maximum value: " +
                maxVal.get());

        // Sort the stream by use of sorted().
        Stream<Integer> sortedStream = myList.stream().sorted();

        // Display the sorted stream by use of forEach().
        System.out.print("Sorted stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        // Display only the odd values by use of filter().
        Stream<Integer> oddVals =
                myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Odd values: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        // Display only the odd values that are greater than 5. Notice that
        // two filter operations are pipelined.
        oddVals = myList.stream().filter( (n) -> (n % 2) == 1)
                .filter((n) -> n > 5);
        System.out.print("Odd values greater than 5: ");
        oddVals.forEach((n) -> System.out.print(n + " ") );
        System.out.println();

        System.out.println("Original list: " + myList);

        //reduce() 1 method
        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if(productObj.isPresent()) System.out.println("method reduce 1 - " + productObj.get());

        //reduce 2 method
        int prodInt = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("method reduce 1 - " + prodInt);

        int evenProd = myList.stream().reduce(1, (a,b) ->{
            if (b % 2 == 0) return a * b;
            else return a;
        });
        System.out.println("evenProd - " + evenProd );

        //parallel
        Optional<Integer> parallelObj = myList.parallelStream().reduce((a, b) -> a * b);
        System.out.println("paralel 1 - " + parallelObj.get());

        //parallel 2
        int parallelObj2 = myList.parallelStream().reduce(1, (a, b) -> a * b, (a, b) -> a * b);
        System.out.println("parallel 2 - " + parallelObj2);


    }
}
