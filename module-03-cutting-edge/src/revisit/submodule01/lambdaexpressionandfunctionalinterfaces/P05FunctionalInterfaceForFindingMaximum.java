package revisit.submodule01.lambdaexpressionandfunctionalinterfaces;

interface MaxFinder {
    int findMax(int a, int b);
}

public class P05FunctionalInterfaceForFindingMaximum {
    public static void main(String[] args) {
        MaxFinder maxFinder = (a, b) -> (a > b) ? a : b;
        System.out.println("Maximum: " + maxFinder.findMax(20, 45));
    }
}
