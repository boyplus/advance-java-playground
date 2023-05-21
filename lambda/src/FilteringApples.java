import model.Apple;
import predicate.AppleGreenColorPredicate;
import predicate.AppleHeavyWeightPredicate;
import predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(List.of(
                new Apple(151, "red"),
                new Apple(140, "red"),
                new Apple(159, "green"),
                new Apple(120, "green")
        ));

        // # 1. Filtering by abstract criteria

        List<Apple> heavyApples = filterApples(apples, new AppleHeavyWeightPredicate());
        System.out.println("Heavy weight apples");
        printApples(heavyApples);

        List<Apple> greenApples = filterApples(apples, new AppleGreenColorPredicate());
        System.out.println("Green apples");
        printApples(greenApples);


        // # 2. Using an anonymous class
        // By creating an object that implements ApplePredicate using anonymous
        // However, it's not good enough since it's bulky
        List<Apple> redApples = filterApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.color.toLowerCase().equals("red");
            }
        });
        System.out.println("===================");
        System.out.println("Anonymous class");
        System.out.println("Red apples");
        printApples(redApples);

        // # 3. using a Lambda expression
        List<Apple> result = filterApples(apples,
                (Apple apple) -> apple.color.toLowerCase().equals("red")
        );

        System.out.println("===================");
        System.out.println("Lambda expression");
        System.out.println("Red apples");
        printApples(result);

        // # 4. Abstracting over a List type
        System.out.println("===================");
        System.out.println("Abstracting over a list type");
        System.out.println("Red apples");
        List<Apple> redApples2  = filterApples(apples, (Apple apple) -> apple.color.toLowerCase().equals("red"));
        printApples(redApples2);

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        List<Integer> evenNumbers = filter(numbers, (Integer i) -> i%2 == 0);
        System.out.println("Even numbers");
        for(Integer i:evenNumbers) {
            System.out.print(i+" ");
        }
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

    public static void printApples(List<Apple> apples){
        for(Apple apple:apples){
            System.out.println(apple.weight+" "+apple.color);
        }
    }

    // # Abstracting over a List type
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T el:list){
            if(p.test(el)){
                result.add(el);
            }
        }
        return result;
    }
}