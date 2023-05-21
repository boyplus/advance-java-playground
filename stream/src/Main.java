import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> titles = Arrays.asList("Modern","Java","In","Action");
        Stream<String> s = titles.stream();
        s.forEach(System.out::print);
        System.out.println();
        System.out.println("==========================");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squares = numbers.stream().map(n -> n*n).toList();
        squares.forEach(System.out::println);

    }
}