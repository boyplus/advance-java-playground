import predicate.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> l = map(Arrays.asList("lambdas","in","action"), (String s)->s.length());
        for(Integer i:l){
            System.out.println(i);
        }

        // Note: converting primitive type to object type is called "Autoboxing"
        // Unboxing -> convert object type to primitive type

        IntPredicate evenNumbers = (int i) -> i%2 == 0;
        boolean isEven = evenNumbers.test(12);
        System.out.println(isEven);

        Predicate<Integer> oddNumbers = (Integer i) -> i%2 != 0;
        boolean isOdd = oddNumbers.test(12);
        System.out.println(isOdd);
    }

    // Note that return type come after Generic Type
    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for(T t:list){
            result.add(f.apply(t));
        }
        return result;
    }
}
