import model.Apple;
import predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TypeInferenceExmaple {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(List.of(
                new Apple(151, "red"),
                new Apple(140, "red"),
                new Apple(159, "green"),
                new Apple(120, "green")
        ));

        ////////////////////////////////////////
        // Type inference
        ////////////////////////////////////////
        List<Apple> greenApples2 = filterApples(apples, (Apple a) -> a.color.toLowerCase().equals("green"));
        // No explicit type on the parameter apple
        List<Apple> greenApples3 = filterApples(apples, apple -> apple.color.toLowerCase().equals("green"));

        // Another example
        Comparator<Apple> c1 = (Apple a1, Apple a2) -> a1.weight - a2.weight;
        // With type inference
        Comparator<Apple> c2 = (a1, a2) -> a1.weight - a2.weight;

        ////////////////////////////////////////
        // Capturing lambda
        ////////////////////////////////////////
        int portNumber = 1337;
        Runnable r = () -> System.out.println(portNumber);
        // we could not assign new value to var if it is used in lambda
        // Var need to be "final"
        // portNumber = 31337;
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
