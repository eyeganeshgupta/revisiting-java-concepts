package revisit.submodule01.lambdaexpressionandfunctionalinterfaces;

@FunctionalInterface
interface EvenFilter {
    boolean isEven(int number);
}

public class P10FunctionalInterfaceForFilteringEvenNumbers {
    public static void main(String[] args) {
        EvenFilter evenFilter = (number) -> number % 2 == 0;
        System.out.println("Is 8 even? " + evenFilter.isEven(8));
        System.out.println("Is 7 even? " + evenFilter.isEven(7));
    }
}
