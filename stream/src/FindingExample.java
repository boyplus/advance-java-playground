import model.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingExample {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>(Arrays.asList(
                new Dish("d1",120),
                new Dish("d2",300),
                new Dish("d3",350),
                new Dish("d4",400),
                new Dish("d5",530)
        ));

        // find any -> return Optional
        // To see if there is an el (Usually comes after filter !)
        Optional<Dish> dish = dishes.stream().filter(d->d.getCal() > 600).findAny();
        if(dish.isPresent()){
            System.out.println("Cal > 600 is present");
        } else {
            System.out.println("Cal > 600 is not present");
        }

        dishes.stream().filter(d->d.getCal() > 400).findAny().ifPresent(d-> System.out.println(d.getCal()));

    }
}
