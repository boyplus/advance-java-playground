@FunctionalInterface
// Function<T,R> interface define an abstract method named "apply"
// that take and object of type T as an input and return type R
public interface Function<T, R> {
    public R apply(T t);
}
