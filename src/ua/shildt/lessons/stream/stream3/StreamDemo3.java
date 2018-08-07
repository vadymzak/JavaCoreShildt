package ua.shildt.lessons.stream.stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Working with map()
public class StreamDemo3 {

    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> namePhoneEmails = new ArrayList<>();

        namePhoneEmails.add(new NamePhoneEmail("Larry", "555-55555555","larry.gmail.com"));
        namePhoneEmails.add(new NamePhoneEmail("James", "555-55555234","james.gmail.com"));
        namePhoneEmails.add(new NamePhoneEmail("Marry", "555-55555234", "marry.gmail.com"));

        System.out.println("Початкові елементи: ");
        namePhoneEmails.stream().forEach((a) -> System.out.println("name - " + a.name + " phone - " + a.phone +
                " email - " + a.email));

        System.out.println();

        Stream<NamePhone> namePhoneStream = namePhoneEmails.stream().map((a) -> new NamePhone(a.name, a.phone));

        System.out.println("List of names and phones:");
        namePhoneStream.forEach((a) -> System.out.println("name - " + a.name + " phone - " + a.phone));

        Stream<NamePhone> namePhoneFilter = namePhoneEmails.stream().filter((a) -> a.phone.equals("555-55555234"))
                .map((a) -> new NamePhone(a.name, a.phone));
        System.out.println();
        System.out.println("List of names and phones with filter:");
        namePhoneFilter.forEach((a) -> System.out.println("name - " + a.name + " phone - " + a.phone));

        //Collection from Stream
        namePhoneStream = namePhoneEmails.stream().map((a) -> new NamePhone(a.name, a.phone));
        List<NamePhone> namePhonesList = namePhoneStream.collect(Collectors.toList());
        namePhonesList.stream().forEach((a) -> System.out.println(a.name + " " + a.phone));

        Stream<String> stSt = Stream.of("A", "BB", "CCC");
        stSt.forEach((a) -> System.out.println(a));
    }
}
