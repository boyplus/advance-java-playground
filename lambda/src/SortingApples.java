import comparator.AppleWeightComparator;
import model.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApples {
    public static void main(String[] args) {
        List<Apple> originalApples = new ArrayList<>(List.of(
                new Apple(151, "red"),
                new Apple(140, "red"),
                new Apple(159, "green"),
                new Apple(120, "green")
        ));

        // *Note that Collections.sort() mutate the original List

        // # 1. Using comparator object (init new class that implements Comparator<>)
        System.out.println("Sort by using comparator object");
        List<Apple> apples1 = new ArrayList<>(originalApples);
        Collections.sort(apples1, new AppleWeightComparator());

        printApples(apples1);

        // # 2. Using an anonymous class (assigned to object)
        Comparator<Apple> byWeight = new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return -(a1.weight - a2.weight);
            }
        };

        System.out.println("Sort by using anonymous class");
        List<Apple> apples2 = new ArrayList<>(originalApples);
        // Or we could pass new Comparator() directly
        Collections.sort(apples2, byWeight);
        printApples(apples2);

        // # 3. Using lambda expression
        System.out.println("Sort by using lambda expression");
        List<Apple> apples3 = new ArrayList<>(originalApples);
        Collections.sort(apples3, (Apple a1, Apple a2) -> a1.weight - a2.weight);

        printApples(apples3);

        // Can also assign to var
        System.out.println("Assign lambda to var");
        Comparator<Apple> byWeight2 = (Apple a1, Apple a2) -> a1.weight - a2.weight;
        List<Apple> apples4 = new ArrayList<>(originalApples);
        Collections.sort(apples4, byWeight2);
        printApples(apples4);



        // *Note
        //   Lambda parameters       Lambda body
        // (Apple a1, Apple a2) -> a1.weight - a2.weight

        // Predicate interface has boolean test(Test t)
        // We could pass lambda expression that require one parameter (Test) and return boolean

        // Functional interface -> is an interface that specifies exactly one abstract method
        // Lambda expression let you provide the implementation of the abstract method of a function interface
        // directly inline and treat the whole expression as an instance of a function interface
        // -> Instance of a concrete implementation of the functional interface
        // Can achieve the same thing with an anonymous inner class


    }

    public static void printApples(List<Apple> apples){
        for(Apple apple:apples){
            System.out.println(apple.color+" "+apple.weight);
        }
    }
}
