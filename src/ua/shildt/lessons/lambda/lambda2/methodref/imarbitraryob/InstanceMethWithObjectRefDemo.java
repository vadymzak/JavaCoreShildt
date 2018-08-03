package ua.shildt.lessons.lambda.lambda2.methodref.imarbitraryob;

//Reference to an instance method of an arbitrary object of a particular type
public class InstanceMethWithObjectRefDemo {

    static <T> int counter(T[] vals, MyFunk<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.funk(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int count = 0;

        Hightemp[] weekDayHigh = {
                new Hightemp(89), new Hightemp(82),
                new Hightemp(90), new Hightemp(89),
                new Hightemp(89), new Hightemp(91),
                new Hightemp(84), new Hightemp(83)
        };

        count = counter(weekDayHigh, Hightemp::sameTemp, new Hightemp(89));

        System.out.println("Днів, коли макс. температ була 89: " + count);

        Hightemp[] weekDayHigh2 = {new Hightemp(32), new Hightemp(12),
                                  new Hightemp(24), new Hightemp(19),
                                  new Hightemp(18), new Hightemp(12),
                                  new Hightemp(-1), new Hightemp(13)};

        count = counter(weekDayHigh2, Hightemp::sameTemp, new Hightemp(12));
        System.out.println("Днів, коли макс. температ була 12: " + count);

        count = counter(weekDayHigh, Hightemp::lessThenTemp, new Hightemp(89));
        System.out.println("Днів, коли макс. температ була меншше 89: " + count);
    }
}
