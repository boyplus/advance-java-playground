import model.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Apple> originalApples = new ArrayList<>(List.of(
                new Apple(151, "red"),
                new Apple(140, "red"),
                new Apple(159, "green"),
                new Apple(120, "green")
        ));

        List<Apple> apples1 = new ArrayList<>(originalApples);

        // Method reference: shorthand for lambdas calling only a specific method
        apples1.sort(Comparator.comparing(Apple::getWeight));
        printApples(apples1);

        // Example of lambdas and method reference equivalents
        // 1. (Apple apple) -> apple.getWeight()
        // Apple::getWeight

        // 2. () -> Thread.currentThread().dumpStack()
        // Thread.currentThread::dumpStack

        // 3. (str, i) -> str.substring(i)
        // String::substring

        // 4. (String s) -> sout(s)
        // System.out::println

        // 5. (String s) -> this.isValidName(s)
        // this::isValidName
    }

    public static void printApples(List<Apple> apples){
        for(Apple apple:apples){
            System.out.println(apple.weight+" "+apple.color);
        }
    }
}
