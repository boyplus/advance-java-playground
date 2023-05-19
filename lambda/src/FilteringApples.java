import model.Apple;
import predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(List.of(
                new Apple(151, "red"),
                new Apple(140, "red"),
                new Apple(159, "green"),
                new Apple(120, "green")
        ));

    }

    public static List<Apple> filterApples(List<Apple> apples, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:apples) {
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}