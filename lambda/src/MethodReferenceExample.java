import model.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Apple> originalApples = new ArrayList<>(List.of(
                new Apple(151, "red"),
                new Apple(140, "Red"),
                new Apple(159, "Green"),
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

        // 3 Types of method reference
        // 1. Reference to a "static method"
        // Example:
        // (args) -> ClassName.staticMethod(args)
        // ClassName::staticMethod

        // 2. Reference to an instance method of an arbitrary type
        // This type refers to a method to an object that will be supplied as one
        // of the parameters of the lambda
        // Example:
        // (arg0, rest) -> arg0.instanceMethod(rest)        arg0 is of type ClassName
        // ClassName::instanceMethod

        // (apple, rest) -> apple.getSomething(rest)
        // Apple::getSomething

        // 3. Reference to an instance method of an existing object or expression
        // Example:
        // (args) -> expr.instanceMethod(args)
        // expr::instanceMethod


        // Exercise
        List<String> originalStr = Arrays.asList("a","b","A","B");
        List<String> str1 = new ArrayList<>(originalStr);

        // Without method ref
        str1.sort((s1,s2) -> s1.compareToIgnoreCase(s2));

        List<String> str2 = new ArrayList<>(originalStr);

        //With method ref (second type)
        str2.sort(String::compareToIgnoreCase);

        TestMethodReference a = new TestMethodReference();
        List<String> filteredWords = a.test();
        System.out.println(filteredWords);
    }

    public static void printApples(List<Apple> apples){
        for(Apple apple:apples){
            System.out.println(apple.weight+" "+apple.color);
        }
    }
}
