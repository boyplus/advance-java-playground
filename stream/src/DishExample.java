import model.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DishExample {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>(Arrays.asList(
                new Dish("d1",120),
                new Dish("d2",300),
                new Dish("d3",350),
                new Dish("d4",400),
                new Dish("d5",530)
        ));

        List<String> lowCalDishesName = dishes
                .stream()
                .filter(d -> d.getCal() < 400)
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(lowCalDishesName);

        // Stream API lets you write code that
        // 1. Declarative -> More concise and readable
        // 2. Composable -> Greater flexibility
        // 3. Parallelizable -> Better performance

        List<String> highCalDishesName = dishes.stream()
                .filter(d->d.getCal() > 300)
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(highCalDishesName);

        // filter, map, limit -> "intermediate operation"
        // collect, count (return "long" not int) -> cause pipeline to be executed and close it -> "Terminal operation"

        // Working with Stream -> Builder pattern
        // 1. Data source (such as collection) to perform a query on
        // 2. Chain of intermediate operations that form a stream pipeline
        // 3. A terminal operation -> execute the stream pipeline and produces a result



    }
}
