import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        // Take an argument and consume it!!
        forEach(Arrays.asList(1,2,3,4,5,6), (Integer i)-> System.out.println(i));
    }

    // Consumer<T> interface define an abstract method named "accept" that take one T
    // and return no result (void)

    public static <T> void forEach(List<T> list, Consumer<T> c){
        for(T t:list){
            c.accept(t);
        }
    }
}
