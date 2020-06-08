import java.util.stream.Stream;

public class NumbersOfStreamTest {
    public static void main(String[] args) {
        Stream<Integer> streamNumbers = Stream.iterate(8, n -> n + 1);
        streamNumbers
                .filter(NumbersOfStreamTest::bigerThenHoundertAndDivideByFive)
                .map(number-> number*3)
                .limit(10)
                .forEach(System.out::println);
    }

    private static boolean bigerThenHoundertAndDivideByFive(Integer number) {
        return number > 100 && number % 5 == 0;
    }
}
