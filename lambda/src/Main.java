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
    }
}
