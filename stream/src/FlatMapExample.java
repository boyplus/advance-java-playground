import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello","World");

        List<String> uniqueCharacters = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        // FlatMap -> convert Stream<T[]> into Stream<T>
        // In this case is Stream<String[]> -> Stream<String>
        System.out.println(uniqueCharacters);
    }
}
