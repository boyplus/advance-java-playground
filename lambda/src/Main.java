import model.Apple;
import predicate.Predicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example of Functional Interface and use cases

        // 1. Predicate<T> T -> boolean
        // 2. Consumer<T> T -> void
        // 3. Function<T,R> t -> R
        // 4. Supplier<T> () -> T

        // Lambda Use Cases and Example with Functional Interfaces

        // 1. Boolean Expression
        // (List<String list>) -> list.isEmpty()
        // Predicate<List<String>>

        // 2. Creating Object
        // () -> new Apple(10)
        // Supplier<Apple>

        // 3. Consuming from an object
        // (Apple a) -> sout(a.weight)
        // Consumer<Apple>

        // 4. Select / Extract from an object
        // (String s) -> s.length()
        // Function<String, Int> OR ToIntFunction<String> (no need to specify R since the name is implied)

        // 5. Combine two values
        // (int a,int b) -> a*b
        // IntBinaryOperator

        // 6. Compare two object
        // (Apple a1, Apple a2) -> a1.weight.compareTo(a2.weight)
        // Comparator<Apple> OR BiFunction<Apple,Apple,Integer> OR ToIntBiFunction<Apple,Apple>


        // Exception, lambdas an functional interfaces
        // None of the functional interface allow for a checked expection to be thrown
        // 1. Define our onw functional interface
        // 2. Wrap a lambda body with a try/catch block

        // *Note: The method add of a List returns a "boolean" and not "void"
        // Special void-compatibility rule
        List<String> list = new ArrayList<>();
        // Predicate has a boolean return
        Predicate<String> p = (String s) -> list.add(s);

        // Consumer has a void return
        Consumer<String> b = (String s) -> list.add(s);

        // Which will get executed ?
        // The error will be ambiguous call -> need to cast to Runnable or Action
        // execute(()->{});
        execute((Action) () -> {} );
        execute((Runnable) () -> {} );
    }

    public static void execute(Runnable runnable){
        runnable.run();
    }

    public static <T> void execute(Action<T> action){
        action.act();
    }
}

@FunctionalInterface
interface Action<T>{
    void act();
}
