package revisit.submodule01.lambdaexpressions.functionalinterfaces;

interface Calculator {
    int add(int a, int b);
}

public class P02FunctionalInterfaceWithReturnValue {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        System.out.println("Sum: " + calculator.add(18, 2));
    }
}
