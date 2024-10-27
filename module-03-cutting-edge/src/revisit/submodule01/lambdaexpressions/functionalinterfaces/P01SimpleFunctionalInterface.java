package revisit.submodule01.lambdaexpressions.functionalinterfaces;

interface Greeting {
    void sayHello(String name);
}

public class P01SimpleFunctionalInterface {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello, " + name);
        greeting.sayHello("Ganesh");
    }
}