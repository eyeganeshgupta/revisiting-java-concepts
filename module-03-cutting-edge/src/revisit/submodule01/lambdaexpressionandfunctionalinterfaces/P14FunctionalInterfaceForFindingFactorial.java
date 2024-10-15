package revisit.submodule01.lambdaexpressionandfunctionalinterfaces;

@FunctionalInterface
interface FactorialCalculator {
    long factorial(int n);
}

public class P14FunctionalInterfaceForFindingFactorial {
    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = (n) -> {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Factorial of 5: " + factorialCalculator.factorial(5));
    }
}
