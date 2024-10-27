package revisit.submodule01.lambdaexpressionandfunctionalinterfaces;

interface Multiplier {
    int multiply(int a, int b);

    default void printMessage() {
        System.out.println("This is a multiplier interface.");
    }
}

public class P04CustomFunctionalInterfaceWithDefaultMethod {
    public static void main(String[] args) {
        Multiplier multiplier = (a, b) -> a * b;
        System.out.println("Product: " + multiplier.multiply(4, 5));
        multiplier.printMessage();
    }
}
