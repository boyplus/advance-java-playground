import java.lang.invoke.CallSite;
import java.util.concurrent.Callable;

public class Lambda {
    public static void main(String[] args) {
        // Predicate interface has boolean test(Test t)
        // We could pass lambda expression that require one parameter (Test) and return boolean

        // Functional interface -> is an interface that specifies exactly one abstract method
        // Lambda expression let you provide the implementation of the abstract method of a function interface
        // directly inline and treat the whole expression as an instance of a function interface
        // -> Instance of a concrete implementation of the functional interface
        // Can achieve the same thing with an anonymous inner class

        // # Runnable -> is a functional interface defining only one abstract method, run:
        // Take no parameter and return void
        // A lambda expression can be assigned to a variable or passed to a method executing a functional interface as argument
        // The signature of the run method defined in the Runnable interface
        Runnable r1 = () -> System.out.println("Hello world1");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world2");
            }
        };

        process(r1);
        process(r2);
        process(()-> System.out.println("Hello world3"));

        // ## Functional Descriptor
        // functional interface there is exactly one (1) abstract method -> Function descriptor
        // It describes the signature of the lambda expression

        // We don't have to enclose a single void method invocation in braces
        execute(()->{});
        execute(()-> System.out.println("hello"));
        execute(()-> { System.out.println("hello"); });


        // # Callable<T>: has the function descriptor (lambda expression signature) ot
        // () -> T
        Callable test = fetch();
    }

    public static void process(Runnable r){
        r.run();
    }

    public static void execute(Runnable r){
        r.run();
    }

    public static Callable<String> fetch(){
        return () -> "Tricky exmaple :)";
    }
}
