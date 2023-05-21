import model.Apple;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args) {
        /////////////////////////////
        // Zero argument constructor
        ////////////////////////////

        // *Note Supplier<T> is () -> T
        Supplier<Apple> c1 = Apple::new;

        // Need to call get() to invoke the method
        Apple a1 = c1.get();

        // Which is equal to
        Supplier<Apple> c2 = () -> new Apple();
        // Calling supplier's get method produces a new Apple
        Apple a2 = c2.get();



        /////////////////////////////
        // One argument -> int: weight
        ////////////////////////////

        // Fits Function<Integer, Apple>
        Function<Integer, Apple> f1 = Apple::new;
        Apple a3 = f1.apply(110);

        // Which is equal to
        //                       Type can be omitted
        Function<Integer, Apple> f2 = (weight) -> new Apple(weight);
        Apple a4 = f2.apply(110);


        /////////////////////////////
        // Two arguments -> String: color, int: weight
        ////////////////////////////
        BiFunction<Integer,String, Apple> b1 = Apple::new;
        Apple a5 = b1.apply(110,"green");

        // Which is equal to
        BiFunction<Integer, String, Apple> b2 = (weight, color) -> new Apple(weight, color);
        Apple a6 = b2.apply(110,"green");
    }
}
