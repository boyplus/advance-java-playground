public class SortingExample {
    public static void main(String[] args) {
        // 1. Passing code -> using custom Comparator class e.g. AppleComparator

        // 2. Using anonymous class
        // apples.sort(new Comparator(){ public int compare(...)})

        // 3. Using lambda expression
        // apples.sort((Apple a1, Apple a2) -> a1.weight - a2.weight);
        // apples.sort((a1, a2) -> a1.weight - a2.weight);
        // Can also use static comparing method

        // Comparator<Apple> c = Comparator.comparing((Apple a) -> a.weight);
        // apples.sort(c);
        // OR
        // apple.sort(Comparator.comparing(apple -> apple.weight));

        // 4. Using method ref
        // apple.sort(Comparator.comparing(Apple::getWeight))
    }
}
